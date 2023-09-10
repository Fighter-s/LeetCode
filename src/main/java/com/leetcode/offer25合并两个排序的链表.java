package com.leetcode;

public class offer25合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode newHead1 = new ListNode(0);
        ListNode newHead = newHead1;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                newHead.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                newHead.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            newHead = newHead.next;
        }

        if(l1 == null) newHead.next = l2;
        if(l2 == null) newHead.next = l1;

        return newHead1.next;
    }
}
