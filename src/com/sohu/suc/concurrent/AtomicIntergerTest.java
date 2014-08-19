/**
 * $Id$
 */
package com.sohu.suc.concurrent;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wenpingliu
 * @version  
 * 2013-3-19
 */
public class AtomicIntergerTest {
	
	class IntWrapper {
		Integer intvalue = 10;

		public Integer getIntvalue() {
			return intvalue;
		}

		public void setIntvalue(Integer intvalue) {
			this.intvalue = intvalue;
		}
		
		public void add(){
			intvalue ++ ;
		}
	}
	
	@Test
	public void test() throws InterruptedException {
		final AtomicInteger value = new AtomicInteger(10);
		final IntWrapper intvalue = new IntWrapper();
		System.out.println(value.get());
		System.out.println(value.get() == 10);
		System.out.println(new Integer(10) == 10);
		System.out.println(value.equals(10));
		int size = 10;
		Thread[] ts = new Thread[size];
		for(int i = 0;i<size;i++) {
			ts[i] = new Thread() {
				@Override
				public void run() {
					value.incrementAndGet();
					intvalue.add();
					super.run();
				}
				
			};
		}
		for(Thread thread: ts) {
			thread.start();
		}
		for(Thread thread: ts) {
			thread.join();
		}
		System.out.println(value.get());
		System.out.println(intvalue.getIntvalue());
	}
}
