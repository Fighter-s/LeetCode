package com.leetcode.sworFingerOffer;

public class offer11旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int minNum = numbers[0];

        int length = numbers.length;

        for (int i = 1; i < length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }

        return minNum;
    }
}
