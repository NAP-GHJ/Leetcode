package com.leetcode.review;

import java.util.List;

public class class24 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
    }

    public ListNode swapPairs(ListNode head){

        if(head == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        if(second == null) return first;

        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }
}
