package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution234回文链表 {

    /**
     * 采用List存储的方式
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        // 遍历整个链表，将每个节点的数字存到list中
        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int start = 0;
        int end = list.size()-1;

        while(start < end){
            if(list.get(start) != list.get(end)){
                return false;
            }
            start++;
            end --;
        }

        return true;
    }


    /**
     * 采用快慢指针+翻转链表的方式
     * @param head
     * @return
     */
    public boolean isPalindrome1(ListNode head) {
        // 使用快慢指针找到中间节点
        ListNode midListNode = getMidListNode(head);

        // 根据中间节点将第二部分链表翻转
        ListNode listNode = reverseListNode(midListNode.next);

        // 将两块链表进行对比
        return compareListNode(head,listNode);
    }


    /**
     * 采用快慢指针+翻转链表的方式
     * @param head
     * @return
     */
    public boolean isPalindrome2(ListNode head) {
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;

            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }

        // 如果fast不是空的，说明这个链表的数量是单数，slow在中间
        if(fast != null){
            slow = slow.next;
        }

        while(pre != null && slow != null){
            if(pre.val != slow.val) return false;
            pre = pre.next;
            slow = slow.next;
        }

        return true;
    }

    private ListNode getMidListNode(ListNode node){
        ListNode slow = node;
        ListNode fast = node;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseListNode(ListNode listNode){
        ListNode head = listNode;

        ListNode pre = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        listNode.next = null;
        return pre;
    }

    private boolean compareListNode(ListNode start,ListNode end){
        while(end != null){
            if(start.val != end.val) return false;
            start = start.next;
            end = end.next;
        }

        return true;
    }
}
