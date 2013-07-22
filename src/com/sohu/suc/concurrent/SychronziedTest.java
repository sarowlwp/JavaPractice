package com.sohu.suc.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SychronziedTest {
	
	private static int count = 0;
	
	public static int incr(){
		return count++;
	}
	
	public static synchronized int incr1(){
		return count++;
	}
	
	public static int incr2(){
		synchronized (SychronziedTest.class) {
			return count++;
		}
		
	}
	
	public static void main(String[] args) {
		ExecutorService executorService  = Executors.newFixedThreadPool(50);
		for(int i=0 ; i<2000 ;i ++){
			executorService.execute(new Thread() {
				@Override
				public void run() {
					this.setName(this.getName() + "--"+ System.currentTimeMillis());
					System.out.println(this.getName() + "sync:" + (SychronziedTest.incr2()));
					//System.out.println(this.getName() + "sync:" + (SychronziedTest.incr()));
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				}
			});
		}
		executorService.shutdown();
		while(!executorService.isTerminated()){
			
		}
		System.out.println(SychronziedTest.incr());
	}

}
