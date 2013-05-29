package com.sohu.suc.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class ThreadPoolTest {
	ExecutorService executorService = null;
	
	@Test
	public void TestSingle() throws InterruptedException, ExecutionException{
		executorService = Executors.newSingleThreadScheduledExecutor();
		//executorService.ex
		Future<String> resultFuture = executorService.submit(new CallalbeThread());
		System.out.println(resultFuture.get());
		executorService.execute(new RunnableThread());
		String test = "got it";
		resultFuture = executorService.submit(new RunnableThread(), test);
		System.out.println("result:" + test);
		System.out.println(resultFuture.get());
		
		
	}
	
	
	
}

class CallalbeThread implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("call ing");
		return "call me";
		
	}
}

class RunnableThread implements Runnable,Callable<String> {
	public void run() {
		System.out.println("runing");
		throw new RuntimeException("oh god");
	}

	@Override
	public String call() throws Exception {
		return "run me";
	}
}

