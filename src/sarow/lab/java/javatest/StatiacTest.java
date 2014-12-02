/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.javatest;

/**
 *
 * @author wenpingliu
 * @version v 0.1 10/18/14 21:37 wenpingliu Exp $$
 */
public class StatiacTest {

    public static int instanceCount;
    public StatiacTest(){
        instanceCount ++;
    }

    public static void main(String[] args) {
        for(int i = 0 ; i<10;i++){
            new StatiacTest();
        }
        System.out.println("count:" + new StatiacTest().instanceCount);
    }
}
