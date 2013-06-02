package com.sohu.suc.designpattern;

/**
 * 模板方法
 * 封装算法细节到一个模板类，由其他具体类实现需要差异的地方，或者覆盖方法实现定制化
 * @author wenpingliu
 *
 */
public class Temple {
	public static void main(String[] args) {
		new MakePigMeat().cook();
		System.out.println("------------------");
		new MakeSugarTomato().cook();
	}
}

abstract class MakeFood{
	
	public void cook(){
		buyFood();
		prepareFood();
		cleanFood();
		cutFood();
		if(!getEatDirect()){
			cookFood();
		}
	}
	
	public boolean getEatDirect(){
		return false;
	}
	
	public void buyFood(){
		System.out.println("Shop in market.");
	}
	
	public void prepareFood(){
		System.out.println("Get food,Clean useless part.");
	}
	
	public void cleanFood(){
		System.out.println("Wash food.");
	}
	
	public abstract void cutFood();
	public abstract void cookFood();
}

class MakeSugarTomato extends MakeFood{
	
	//钩子，通过覆盖改变算法的可定制部分
	@Override
	public boolean getEatDirect(){
		return false;
	}
	
	@Override
	public void cutFood() {
		// TODO Auto-generated method stub
		System.out.println("cut with fruitTable");
	}

	@Override
	public void cookFood() {
		// TODO Auto-generated method stub
		System.out.println("Put sugar and tomato toghter.");
	}
	
}

class MakePigMeat extends MakeFood{

	@Override
	public void cutFood() {
		// TODO Auto-generated method stub
		System.out.println("Cut meat with woodtable.");
	}

	@Override
	public void cookFood() {
		// TODO Auto-generated method stub
		System.out.println("Pull oil and cook with otherthing.");
	}
	
}