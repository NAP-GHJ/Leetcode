package com.leetcode.review;

import java.util.Comparator;
import java.util.PriorityQueue;

public class class23 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length <= 1) return lists[0];
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null)
                queue.add(lists[i]);
        }

        ListNode head = new ListNode(0), tail = head;
        while (!queue.isEmpty()){
            tail.next = queue.poll();
            if(tail.next.next != null){
                queue.add(tail.next.next);
            }
            tail = tail.next;
        }
        return head.next;
    }
}
