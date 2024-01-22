package com.leetcode.hot;

public class hot2两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num = 0;

        ListNode head = new ListNode(0);
        ListNode temp = head;

        while(l1 != null && l2 != null){
            int l1Num = l1.val;
            int l2Num = l2.val;

            int sum = l1Num + l2Num + num;

            num = sum/10;

            temp.next = new ListNode(sum%10);

            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }

        if(l1 != null){
            while(l1 != null){
                int sum = l1.val + num;
                num = sum / 10;
                temp.next = new ListNode(sum % 10);
                l1 = l1.next;
                temp = temp.next;
            }
        }

        if(l2 != null){
            while(l2 != null){
                int sum = l2.val + num;
                num = sum / 10;
                temp.next = new ListNode(sum % 10);
                l2 = l2.next;
                temp = temp.next;
            }
        }

        return head.next;
    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
