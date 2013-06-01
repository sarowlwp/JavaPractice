package com.sohu.suc.designpattern;

/**
 * 单例模式
 * 
 * @author wenpingliu
 *
 */
public class Singleton {
	//阻止new对象
	private Singleton(){
		//init
	}
	
	//单例对象
	private static volatile Singleton self = null;
	
	//对外获取单例对象的方法
	public static Singleton getInstance(){
		if(self == null){
			synchronized (Singleton.class) {
				self = new Singleton();
				return self;	
			}
		}
		return self;
	}
}

