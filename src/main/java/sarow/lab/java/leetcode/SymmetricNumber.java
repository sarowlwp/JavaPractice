/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.leetcode;

/**
 *
 * @author wenpingliu
 * @version v 0.1 10/9/14 15:25 wenpingliu Exp $$
 */
public class SymmetricNumber {
    public static void main(String[] args) {
        SymmetricNumber.getNextSymmetricNumber("123");
        SymmetricNumber.getNextSymmetricNumber("123456789");
        SymmetricNumber.getNextSymmetricNumber("999");
        SymmetricNumber.getNextSymmetricNumber("999099090");
        SymmetricNumber.getNextSymmetricNumber("1092");

    }

    public static String getNextSymmetricNumber(String number){
        String result = null;

        if(number.length() % 2 == 1){
            int mpos = number.length() / 2;
            int mnum = Integer.valueOf(number.charAt(mpos) + "");
            if(mnum < 9){
                getNextSymmetricNumberByMid(mpos,mnum + 1, number);
            }else{
                getNextSymmetricNumberByNine(number);
            }
        }else{
            int mpos = number.length() / 2;
            int mnum = Integer.valueOf(number.charAt(mpos) + "");
            if(mnum < 9){
                getNextSymmetricNumberByMid(mpos,mnum + 1, number);
            }else{
                getNextSymmetricNumberByNine(number);
            }
        }
        return null;
    }

    private static void getNextSymmetricNumberByNine(String number) {
        StringBuilder sb = new StringBuilder("1");
        for(int i=0;i<number.length() -1;i++){
            sb.append(0);
        }
        sb.append(1);
        System.out.println(sb.toString());
    }

    private static void getNextSymmetricNumberByMid(int mpos,int mnum, String number) {
        char[] str = new char[number.length()];
        for(int i=0;i<mnum;i++){
           str[i] = number.charAt(i) > number.charAt(number.length()-1-i) ? number.charAt(number.length()-1-i) : number.charAt(i);
           str[number.length()-1-i] = str[i];
           str[mpos] = (mnum + "").charAt(0);
        }
        System.out.println(new String(str));
    }
}
