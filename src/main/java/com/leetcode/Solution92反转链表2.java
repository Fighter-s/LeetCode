package com.leetcode;

public class Solution92反转链表2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = new ListNode(0);
        node.next = head;

        ListNode start = node;
        ListNode end = node.next;

        // 找到start和end的节点
        for(int i = 0 ; i< left-1;i++){
            start = start.next;
            end = end.next;
        }

        // 采用头插法
        for(int i=0;i < right-left;i++){
            ListNode temp = end.next;
            end.next = end.next.next;
            temp.next = start.next;
            start.next = temp;
        }

        return node.next;
    }
}
