package sarow.lab.java.designpattern;


/**
 * 策略模式
 * 将程序中可变的部分抽出来作为单独的类型
 * @author wenpingliu
 *
 */
public class Strategy {
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		iPhone.setMoveAble(new MoveToHour());
		iPhone.setWIFIsupport(new WIFI3support());
		iPhone.compute();
		
		XPhone xPhone = new XPhone();
		xPhone.setMoveAble(new MoveToHour());
		xPhone.compute();
		
	}
}

abstract class ComputerDevice{
	
	MoveAble move = null;
	WIFIsupport wifi = null;
	
	public void setMoveAble(MoveAble move){
		this.move = move;
	}
	
	public void setWIFIsupport(WIFIsupport wifi){
		this.wifi = wifi;
	}
	
	public abstract void compute();
}

interface MoveAble{
	public void moveaway();
}

interface WIFIsupport{
	public void usewifi();
}

class MoveToHour implements MoveAble{

	@Override
	public void moveaway() {
		System.out.println("you know it");
	}
	
}

class WIFI3support implements WIFIsupport{

	@Override
	public void usewifi() {
		System.out.println("i am wifi 3.0");
	}
	
}

class IPhone extends ComputerDevice{

	@Override
	public void compute() {
		if(move != null){
			move.moveaway();
		}
		if(wifi != null){
			wifi.usewifi();
		}
		System.out.println("i am IPhone");
	}
	
}

class XPhone extends ComputerDevice{

	@Override
	public void compute() {
		if(move != null){
			move.moveaway();
		}
		if(wifi != null){
			wifi.usewifi();
		}
		System.out.println("i am XPhone");
	}
	
}