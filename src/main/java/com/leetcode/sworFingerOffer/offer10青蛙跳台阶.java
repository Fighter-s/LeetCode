package com.leetcode.sworFingerOffer;

public class offer10青蛙跳台阶 {

}

class Solution1 {
    public int numWays(int n) {
        if (n < 2) return 1;
        if (n == 2) return 2;


        int[] nums = new int[n + 1];

        nums[0] = 1;
        nums[1] = 2;

        for (int i = 3; i <= n; i++) {
            nums[i] = (nums[i - 1] + nums[i - 2]) % 1000000007;
        }

        return nums[n];
    }
}
