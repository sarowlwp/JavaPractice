package sarow.lab.java.designpattern;

/**
 * 简单工厂，非设计模式，仅变成习惯
 * @author wenpingliu
 *
 */
public class SimpleFactory {
	public static void main(String[] args) {
		PhoneFactory.getPhoneInstance(phoneType.IPHONE).whoami();
		PhoneFactory.getPhoneInstance(phoneType.XPHONE).whoami();
		PhoneFactory.getPhoneInstance(phoneType.HTCONEX).whoami();

	}

}

enum phoneType{
	IPHONE,XPHONE,HTCONEX;
}

class PhoneFactory{
	public static Phone getPhoneInstance(phoneType type){
		if(phoneType.IPHONE.equals(type)){
			return  new Iphone5();
		}
		if(phoneType.XPHONE.equals(type)){
			return  new Xphone1();
		}
		if(phoneType.HTCONEX.equals(type)){
			return  new HtcOneX();
		}
		return null;
	}
}

interface Phone{
	public void whoami();
}

class Iphone5 implements Phone{

	@Override
	public void whoami() {
		System.out.println("i am create by apple");
	}
	
}

class Xphone1 implements Phone{

	@Override
	public void whoami() {
		System.out.println("i am create by google now");
	}
	
}

class HtcOneX implements Phone{

	@Override
	public void whoami() {
		System.out.println("i am create by htc in taiwan");
	}
	
}

