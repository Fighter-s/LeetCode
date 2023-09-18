package com.leetcode.sworFingerOffer;

import com.leetcode.ListNode;

public class offer22链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 计算出链表的长度
        int count = 0;

        ListNode node = head;

        while(node != null){
            count++;
            node = node.next;
        }

        int index = count - k;
        int x = 1;
        while(x <= index){
            head = head.next;
            x ++;
        }

        return head;
    }
}
