package com.leetcode.review;

public class class21 {

     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(0);
        ListNode head = start;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val) {
                start.next = l1;
                l1 = l1.next;
            }else{
                start.next = l2;
                l2 = l2.next;
            }
            start = start.next;
        }
        if( l1 == null) l1 = l2;
        while(l1 != null){

            start.next = l1;
            l1 = l1.next;
            start = start.next;
        }
        return head.next;
    }
}
