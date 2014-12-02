/**
 * 
 */
package sarow.lab.java.concurrent;

import java.util.concurrent.DelayQueue;

/**
 * @author wenpingliu
 * Date Nov 26, 2013
 */
public class DelayQueueTest {
	
	//单机器，很好的计时队列，多机器呢？ redis is good
	static DelayQueue<DelayTask> queue = new DelayQueue<DelayTask>();
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		for(int i=1;i<=5;i++){    
            System.out.println("即将放入，延迟为：" + (i * 1000));       
            queue.add(new DelayTask(i * 1000));    
        }    
  
        while(queue.size() > 0){  
            System.out.println("即将取出");  
            DelayTask s= queue.take();  //延时时间未到就一直等待    
            if(s!=null){    
                System.out.println(System.currentTimeMillis()  
                        + "  " + s.getDelayedtimt());// 当前时间 与 添加进去时设定的执行时间比较    
            }    
        }
        
        
	}

}

