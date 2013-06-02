package com.sohu.suc.designpattern;

/**
 * 适配器模式
 * 将两个不兼容的类型通过适配，隐藏差异
 * @author wenpingliu
 *
 */
public class Adapter {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new padPhoneAdapter();
		mobilePhone.makecall();
	}
}

interface MobilePhone{
	public void makecall();
}

interface MobilePad{
	public void play();
	public void makephonecall();
}

/**
 * padPhoneAdapter 是 mobilePad 与 mobilePhone 的适配器
 * @author wenpingliu
 *
 */
class padPhoneAdapter implements MobilePhone{
	
	SamsungN8 n8 = new SamsungN8();
	
	@Override
	public void makecall() {
		n8.makephonecall();
	}
	
}

class SamsungN8 implements MobilePad{

	@Override
	public void play() {
		System.out.println("use n8 to play game");
	}

	@Override
	public void makephonecall() {
		System.out.println("use n8 make one phone call");
	}
	
}
