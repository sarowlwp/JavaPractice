package com.sohu.suc.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * volatile 不能保证原子性，只能保证可见性，对于++这种操作，多线程下可能出现数据丢失的情况
 * 下面的例子就是，20w次循环，得到的结果是199994
 * @author wenpingliu
 *
 */
public class VolatileTest {
	static volatile int count = 0;
	static AtomicInteger integer = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService  = Executors.newFixedThreadPool(50);
		for(int i=0 ; i<200000 ;i ++){
			executorService.execute(new Thread() {
				@Override
				public void run() {
					this.setName(this.getName() + "EX"+ System.currentTimeMillis());
					//System.out.println(this.getName() + "old volite:" + (volite.count));
					//System.out.println(this.getName() + "old atomic:" + volite.integer.get());
					//System.out.println(this.getName() + "volite:" + (volite.count ++));
					System.out.println(this.getName() + "volite:" + (VolatileTest.count ++));
					//System.out.println(this.getName() + "atomic:" + volite.integer.getAndAdd(1));
					
				}
			});
		}
		Thread.sleep(20000);
		System.out.println(VolatileTest.count +" | " + VolatileTest.integer.get());
	}
}
