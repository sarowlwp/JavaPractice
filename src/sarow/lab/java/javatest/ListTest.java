/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.javatest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author wenpingliu
 * @version v 0.1 5/23/14 15:34 wenpingliu Exp $$
 */
public class ListTest {
    public static void main(String[] args) {


    }

    public static void testList(){

    }

    public static void testIterator(){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        String value = it.next();
        value = it.next();
        System.out.println(value);
        list.remove(value);
        System.out.println(list);
    }
}
