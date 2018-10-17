package com.leetcode.basic;

public class Class25 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x ;}
    }

    public ListNode reverseKGroup(ListNode head, int k){
        ListNode start = head;
        ListNode end;

        ListNode next = head;
        int i = 0;
        while (next != null){
            i++;
            next = next.next;
        }
        return null;
    }

    public void swapNode(ListNode node1, ListNode node2){

    }
}
