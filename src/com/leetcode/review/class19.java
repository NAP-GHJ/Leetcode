package com.leetcode.review;

public class class19 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }

    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode fast = start, slow = start;
        for(int i = 0; i <= n; i++){
            if(fast == null) return head;
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String [] args){

    }
}
