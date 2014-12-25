/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.javatest;

/**
 *
 * @author wenpingliu
 * @version v 0.1 9/9/14 21:16 wenpingliu Exp $$
 */
public class InstanceOfTest {

    public static Object get(String key,Class classz) {
        Object obj = "";

        if(classz.isInstance(obj)){
            return obj;
        }else{
            return null;
        }
    }

//    public static <T extends Object> T get(String key,Class<T> classz) {
//        Object obj = "";
//
//        if(classz.isInstance(obj)){
//            return obj;
//        }else{
//            return null;
//        }
//    }

    public static void main(String[] args) {
        System.out.println(InstanceOfTest.get("",String.class));
        System.out.println(InstanceOfTest.get("",Integer.class));
        System.out.println("abc" + InstanceOfTest.get("abc",CommentTest.class));

    }
}
