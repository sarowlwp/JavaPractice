/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.javatest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wenpingliu
 * @version v 0.1 6/14/14 0:44 wenpingliu Exp $$
 */
public class ReferenceTest {

    static class Inner{
         public int param;

        public Inner(int p){
           this.param = p;
        }

        @Override
        public String toString() {
            return "Inner{" +
                   "param=" + param +
                   '}';
        }
    }

    public static void main(String[] args){
        Inner toCheck = new Inner(1);
        Inner b = returnTest(toCheck);
        System.out.println(toCheck.equals(b));
        System.out.println(toCheck == (b));
        System.out.println(toCheck);
        System.out.println(b);
        b.param = 100;
        System.out.println(toCheck);
        System.out.println(b);

        List<Inner> list = new ArrayList<Inner>();
        list.add(new Inner(10));
        list.add(new Inner(11));
        list.add(new Inner(12));
        list.add(new Inner(13));

        System.out.println(list);
        for(Inner ele: list){
            if(ele.param==10){
                ele.param = 100;
                //list.remove(ele);
            }
        }

        System.out.println(list);
    }

    public static Inner returnTest(Inner check){
        return check;
    }
}
