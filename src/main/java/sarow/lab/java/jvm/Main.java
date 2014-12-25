/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.jvm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wenpingliu
 * @version v 0.1 6/23/14 14:21 wenpingliu Exp $$
 */
public class Main {

    public static void main(String[] args) {
        Map<TestObject,Integer> test = new HashMap<TestObject, Integer>(2);
        TestObject object = new TestObject(1,1);
        TestObject object2 = new TestObject(1,1);
        Object ob ;
        test.put(object,1);
        test.put(new TestObject(2,2),2);
        System.out.println(test);
        System.out.println(test.get(object));
        System.out.println(test.size());
        System.out.println(test.get(object2));
        int a;
        System.out.println();
        FileReader reader;
        BufferedReader reader2;

    }
}

class TestObject{
    private int value;
    private int key;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestObject)) {
            return false;
        }

        TestObject that = (TestObject) o;

        if (key != that.key) {
            return false;
        }
        if (value != that.value) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + key;
        return result;
    }

    @Override
    public String toString() {
        return "TestObject{" +
               "value=" + value +
               ", key=" + key +
               '}';
    }

    public TestObject(int key,int value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
