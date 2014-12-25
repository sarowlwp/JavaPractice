package sarow.lab.java.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sort{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int lineCount = Integer.valueOf(s);
        int[] numArray = new int[lineCount];
        for(int i=0;i<lineCount;i++){
            s = sc.nextLine();
            String[] sArray = s.split(" ");
            for(String sItem : sArray){
                try{
                    numArray[i] = Integer.parseInt(sItem);
                }catch(Exception e){

                }
            }
        }
        Arrays.sort(numArray);
//        for(int i:numArray){
//            System.out.println(i);
//        }

        int counter = 0;
        int pointer = 0;
        for(int i=0;i<100;i++){

            while(pointer < lineCount && i >= numArray[pointer]){
                counter ++;
                pointer ++;
            }
            System.out.print(counter + "");
        }

    }
}