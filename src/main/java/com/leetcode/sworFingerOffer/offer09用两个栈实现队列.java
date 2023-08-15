package com.leetcode.sworFingerOffer;

import java.util.Stack;

class offer09用两个栈实现队列 {


}

class CQueue{

    Stack<Integer> stackA,stackB;
    public CQueue() {
        stackA = new Stack<Integer>();
        stackB = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stackA.push(value);
    }

    public int deleteHead() {
        if(!stackB.isEmpty()){
            return stackB.pop();
        }

        if(stackA.isEmpty()) return -1;

        while(!stackA.isEmpty()){
            stackB.push(stackA.pop());
        }

        return stackB.pop();
    }
}