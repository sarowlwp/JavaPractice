/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.sohu.suc.javatest;

/**
 *
 * @author wenpingliu
 * @version v 0.1 8/19/14 11:16 wenpingliu Exp $$
 */
public class ObjectTest {
    public static void main(String[] args) {
        Long a = new Long(123);
        Long b = new Long(123);
        System.out.println(a == b);

        a = 123L;
        b = 123L;
        System.out.println(a == b);

    }
}
