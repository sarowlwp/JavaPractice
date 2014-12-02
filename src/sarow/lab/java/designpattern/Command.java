package sarow.lab.java.designpattern;

/**
 * 命令模式
 * 用一个命令中间对象，将调用者和被调用者解耦
 * @author wenpingliu
 *
 */
public class Command {

}

interface Message{
	public String getString();
}

class StringMessage implements Message{

	@Override
	public String getString() {
		return "string message";
	}
	
}

class MapMessage implements Message{

	@Override
	public String getString() {
		return "map string";
	}
	
}

