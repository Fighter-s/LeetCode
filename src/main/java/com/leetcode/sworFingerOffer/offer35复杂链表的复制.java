package com.leetcode.sworFingerOffer;

public class offer35复杂链表的复制 {

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        // 将原来的节点进行复制 a->a->b->b->c->c
        Node cul = head;
        while(cul != null){
            Node node = new Node(cul.val);
            Node next = cul.next;
            cul.next = node;
            node.next = next;
            cul = next;
        }

        // 将复制的节点根据原来的random指针，构建random指针
        cul = head;
        while(cul != null){
            if(cul.random != null) {
                cul.next.random = cul.random.next;
            }
            cul = cul.next.next;
        }

        // 将两个链表进行分离
        cul = head;
        Node res = head.next;
        while(cul.next != null){
            Node temp = cul.next;
            cul.next = temp.next;
            cul = temp;
        }

        return res;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
