package com.leetcode.sworFingerOffer;

/**
 * 动态规划
 */
public class offer14剪绳子1 {
    public int cuttingRope(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;

        // 创建一个dp数组
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i = 4; i <=n ; i++){
            // 一共有j种不同的剪法,f(i) = j * f(i-j) || f(i) = j * (i-j) 两种情况一种情况是剪，一种情况是不剪
            for(int j = 1; j <=i/2;j++){
                dp[i] = Math.max(dp[i],j * Math.max(i-j,dp[i-j]));
            }
        }

        return dp[n];
    }
}
