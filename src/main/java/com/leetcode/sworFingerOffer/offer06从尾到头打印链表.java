package com.leetcode.sworFingerOffer;


import com.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class offer06从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        // 翻转链表
        ListNode reverse = reverse(head);

        List<Integer> list = new ArrayList<>();

        while(reverse != null){
            list.add(reverse.val);
            reverse = reverse.next;
        }

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }


    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
