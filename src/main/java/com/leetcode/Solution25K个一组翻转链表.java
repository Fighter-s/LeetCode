package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/8/17 22:11
 */
public class Solution25K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode start = newHead;
        ListNode end = newHead;

        while(end.next != null){
            for(int i = 0; i < k && end != null;i++ ){
                end = end.next;
            }

            if(end == null){
                break;
            }

            // 记录下一个节点
            ListNode next = end.next;
            ListNode temp = start.next;
            // 记录开始节点


            // 链表断开
            end.next = null;

            // 翻转链表
            ListNode node = reverse(start.next);

            // node的头结点链接
            start.next = node;
            temp.next = next;

            start = temp;
            end = temp;
        }

        return newHead.next;
    }

    private ListNode reverse(ListNode node){
        ListNode head = null;
        ListNode next = null;

        while(node != null){
            next = node.next;
            node.next = head;
            head = node;
            node = next;
        }
        return head;
    }
}
