/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.sohu.suc.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wenpingliu
 * @version v 0.1 8/15/14 16:47 wenpingliu Exp $$
 */
public class ArrayMem {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<String>();
        int[] a = new int[1];
        int count = 1;
        while(true) {
            count ++;
            list =  new ArrayList<String>(1000000 * count);
            a = new int[1000000 * count];
            System.out.println(1000 * count);
            Thread.sleep(5 * 1000);
        }
    }
}
