package com.leetcode;

public class SolutionOffer24翻转链表 {
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head =next;
        }

        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
