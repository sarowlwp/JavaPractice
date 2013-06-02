package com.sohu.suc.designpattern;

/**
 * 装饰者模式
 * 通过封装内部实现，简化使用者的使用行为
 * @author wenpingliu
 *
 */
public class Facade {

	//Boss 来了
	public static void main(String[] args) {
		//对于调用者来说，并不知道软件开发中的各个步骤，装饰者让发出这个需求更简单
		new MakeSoftware().makeWebSite();
		System.out.println("---------------");
		new MakeSoftware().makeConsoleSoftware();
	}
}

class MakeSoftware{
	public void makeWebSite() {
		new MakeRequirement().takeAction();
		new MakeUI().takeAction();
		new MakeArchitecture().takeAction();
		new MakeStoreDesigin().takeAction();
		new MakePrograme().takeAction();
		new MakeTest().takeAction();
	}
	
	public void makeConsoleSoftware(){
		new MakeRequirement().takeAction();
		new MakeArchitecture().takeAction();
		new MakeStoreDesigin().takeAction();
		new MakePrograme().takeAction();
		new MakeTest().takeAction();
	}
}

class MakeRequirement{
	public void takeAction() {
		System.out.println("Making Requirement");
	}
}

class MakeUI{
	public void takeAction() {
		System.out.println("Making UI");
	}
}

class MakeArchitecture{
	public void takeAction() {
		System.out.println("Making Architecture");
	}
}

class MakeStoreDesigin{
	public void takeAction() {
		System.out.println("Making StoreDesign");
	}
}

class MakePrograme{
	public void takeAction() {
		System.out.println("Making Programe");
	}
}

class MakeTest{
	public void takeAction() {
		System.out.println("Making Test");
	}
}
