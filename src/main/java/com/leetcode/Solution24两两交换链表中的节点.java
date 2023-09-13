package com.leetcode;

import java.util.Stack;

public class Solution24两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;

        ListNode res = new ListNode(0);
        ListNode node = head;
        head = res;
        // 创建一个栈来保存2个值
        Stack<ListNode> stack = new Stack<>();

        while(node != null && node.next != null){
            stack.add(node);
            stack.add(node.next);
            // 当前节点往后走两步
            node= node.next.next;

            res.next = stack.pop();
            res = res.next;
            res.next = stack.pop();
            res = res.next;
        }

        // 判断head是否为空（节点的个数是否为奇数）
        if(node == null){
            res.next = null;
        }else {
            res.next = node;
        }

        return head.next;
    }
}
