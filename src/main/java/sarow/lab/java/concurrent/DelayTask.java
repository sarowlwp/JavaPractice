/**
 * 
 */
package sarow.lab.java.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author wenpingliu
 * Date Nov 26, 2013
 */
public class DelayTask implements Delayed{

	long delayedtimt ;	//取出该对象的时间

	/**
	 * @param delayedtimt  延迟取出的时常
	 */
	public DelayTask(long delayedtimt){	
		this.delayedtimt = System.currentTimeMillis() + delayedtimt; 
	}

	//因为该对象是要放到优先级队列里面去的。 所以要实现该方法，与队列里面的其他元素比较。
	@Override  
	public int compareTo(Delayed o) {
		return (int) (getDelay(TimeUnit.MILLISECONDS)
				- o.getDelay(TimeUnit.MILLISECONDS));
	}

	//返回与该对象关联的剩余延迟，在给定的时间单位。
	@Override
	public long getDelay(TimeUnit unit) {
		long sy =  delayedtimt - System.currentTimeMillis();
		return sy;
	}

	public long getDelayedtimt(){
		return delayedtimt;
	}
	
}