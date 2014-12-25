/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.leetcode;

/**
 *
 * @author wenpingliu
 * @version v 0.1 10/26/14 10:13 wenpingliu Exp $$
 */
public class LongestCommonPrefixion {
    public String longestCommonPrefix(String[] strs) {
        String compare = null;
        for(String a : strs){
            if(compare=="")
                return "";
            if(compare == null){
                compare = a;
                continue;
            }
            compare = getCommonPrefix(a,compare);
        }
        return compare == null ? "" : compare;
    }

    public String getCommonPrefix(String a,String b){
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        int i=0;
        int limit = a.length() > b.length() ? b.length() : a.length();
        while(i<limit && limit >0 && as[i] == bs[i]){
            i++;
        }
        return i>0 ? a.substring(0,i) : "";
    }

    public static void main(String[] args) {
        String[] a = new String[1];
        new LongestCommonPrefixion().longestCommonPrefix(a);
    }
}
