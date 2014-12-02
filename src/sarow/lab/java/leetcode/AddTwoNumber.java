/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.leetcode;

/**
 *
 * @author wenpingliu
 * @version v 0.1 5/19/14 11:36 wenpingliu Exp $$
 */
public class AddTwoNumber {
    public static void main(String[] args){

       ListNode l1 = new ListNode(2);
       l1.next = new ListNode(4);
       l1.next.next = new ListNode(3);
       ListNode l2 = new ListNode(5);
       l2.next = new ListNode(6);
       l2.next.next = new ListNode(4);
       l2.next.next.next = new ListNode(4);
       l2.next.next.next.next = new ListNode(4);
       System.out.println(new Solution().addTwoNumbers(new ListNode(0), new ListNode(0)));
       System.out.println(new Solution().addTwoNumbers(l1, l2));
       System.out.println(new Solution().addTwoNumbers(new ListNode(5), new ListNode(5)));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
               "val=" + val +
               ", next=" + next +
               '}';
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode current = null;
        boolean needCarry = false;
        do{
            if(result != null){
                l1 = l1.next == null ? new ListNode(0) :l1.next;
                l2 = l2.next == null ? new ListNode(0) :l2.next;
            }
            int val = 0;
            if(needCarry){
                val = 1;
            }
            val = val + l1.val + l2.val;

            if(val >= 10){
                needCarry = true;
                val = val % 10;
            }else{
                needCarry = false;
            }

            if(result == null){
                result = new ListNode(val);
                current = result;
            }else{
                current.next = new ListNode(val);
                current = current.next;
            }
        }while(l1.next!=null || l2.next!=null);
        if(needCarry){
            current.next = new ListNode(1);
        }
        return result;
    }
}