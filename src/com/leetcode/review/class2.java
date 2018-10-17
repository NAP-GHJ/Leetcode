package com.leetcode.review;

public class class2 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){this.val = x;}
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return null;
        int flag = 0;
        ListNode head = new ListNode(-1);
        ListNode pre = head;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + flag;
            if(sum >= 10) {
                sum -= 10;
                flag = 1;
            }else flag = 0;
            pre.next = new ListNode(sum);
            pre = pre.next;
            l1 = l1.next; l2 = l2.next;
        }


        if(l1 == null) l1 = l2;
        while (l1 != null){
            int sum = l1.val + flag;
            if(sum >= 10) {
                sum -= 10;
                flag = 1;
            }else flag = 0;
            pre.next = new ListNode(sum);
            pre = pre.next;
            l1 = l1.next;
        }

        if(flag == 1) pre.next = new ListNode(1);
        return head.next;
    }
}
