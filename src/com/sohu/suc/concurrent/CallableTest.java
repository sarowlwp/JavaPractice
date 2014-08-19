package com.sohu.suc.concurrent;

import java.util.concurrent.*;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "hello , i am call back.";
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException{
		FutureTask<String> future = new FutureTask<String>(new CallableTest());
		Thread thread = new Thread(future);
		System.out.println(future.isDone());
		thread.start();
		System.out.println(future.isDone());
		Thread.sleep(2000);
		System.out.println(future.isDone());
		Thread.sleep(2000);
		System.out.println(future.isDone());
		System.out.println(future.get(3, TimeUnit.SECONDS));
	}
	
	

}


