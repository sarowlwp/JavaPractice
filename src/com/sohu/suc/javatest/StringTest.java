package com.sohu.suc.javatest;

public class StringTest {
	public static void main(String[] args) {
		String a = "abc";
		String b = "abcd";
		String c = "abcd";
		Integer d = 10;
		System.out.println(a==b);
		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
		System.out.println(b==c);
        String test = "测1试我们的sd你么<div>12";
        test = test.substring(0, 10);
        System.out.println(test);
        test = "ポ④肆钅Ζī總yао蕟咣魡，但簹滿地嘟肆钅Ζī魡鲥鯸，俄自jí匜ィ不知道自jí肆哪顆るず";
        test = test.substring(0, 10);
        System.out.println(test);


    }
}
