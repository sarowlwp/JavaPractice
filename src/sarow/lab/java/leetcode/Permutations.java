/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.leetcode;

import java.util.ArrayList;

/**
 *
 * @author wenpingliu
 * @version v 0.1 5/19/14 13:18 wenpingliu Exp $$
 */
public class Permutations {
    public static void main(String[] args){
        new PermutationsSolution().permute(new int[]{1,2,3});
    }
}

/**
 * 1 2 3
 * * * * *
 * 1 2 3
 * 1 3 2
 * 2 1 3
 * 2 3 1
 * 3 1 2
 * 3 2 1
 * if len = 2
 *    print print swap
 * if len = 3
 *    print one  got to 2
 * if len = 4
 *    print one  go to 3
 */

class PermutationsSolution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

//        if(num.length == 2){
//            Integer[] array = {new Integer(1),new Integer(2)};
//            ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(num));
//            ArrayList<Integer> a = Collections.addAll(num);
//            result.add();
//        }

        return result;
    }


    public void swap(int i,int j,char[] origin){
        char tmp = origin[i];
        origin[i] = origin[j];
        origin[j] = tmp;
    }
}