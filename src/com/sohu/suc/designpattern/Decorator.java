package com.sohu.suc.designpattern;
/**
 * 装饰者模式
 * @author wenpingliu
 *
 */
public class Decorator {
	public static void main(String[] args) {
		BasicIo bio = new BasicIo();
		TextIo tIo = new TextIo(bio);
		BufferIo bIo2 = new BufferIo(tIo);
		System.out.println(bIo2.getLine());
	}
	
}

class BasicIo{
	public String getLine(){
		String basicchar = "get basic char";
		System.out.println(basicchar);
		return basicchar;
	}
}

class TextIo extends BasicIo{
	
	private BasicIo io;
	
	public TextIo(BasicIo bio){
		io = bio;
	}
	
	public String getLine(){
		String basicchar = null;
		if(io != null){
			 basicchar = io.getLine();
		}
		//text convert process
		basicchar = basicchar + " append";		
		System.out.println(basicchar);
		return basicchar;
	}
}

class BufferIo extends BasicIo{
	private BasicIo io;
	
	public BufferIo(BasicIo bio){
		io = bio;
	}
	
	public String getLine(){
		String basicchar = null;
		if(io != null){
			 basicchar = io.getLine();
		}
		//buffer process
		basicchar = basicchar + " buffer";		
		System.out.println(basicchar);
		return basicchar;
	}
}
