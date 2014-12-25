/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.thread;

/**
 *
 * @author wenpingliu
 * @version v 0.1 10/11/14 14:21 wenpingliu Exp $$
 */
public class ThreadLocalTest {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    public static void start(String value){
        if(value != null){
            threadLocal.set(value);
        }else{
            threadLocal.set("sarow");
        }
    }

    public static void  printValue(){
        System.out.println(threadLocal.get());
    }

    public static void main(String[] args) {
        ThreadLocalTest.start(null);
        ThreadLocalTest.printValue();
        ThreadLocalTest.start("java");
        ThreadLocalTest.printValue();
        new Thread(){
            @Override
            public void run() {
                super.run();
                ThreadLocalTest.printValue();
            }
        }.start();

    }
}
