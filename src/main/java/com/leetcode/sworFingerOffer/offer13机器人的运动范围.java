package com.leetcode.sworFingerOffer;

public class offer13机器人的运动范围 {
    int m,n,k;
    boolean[][] flag;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        flag = new boolean[m][n];

        return dfs(0,0,k);
    }

    private int dfs(int i,int j,int k){
        // 条件判断
        if(i < 0 || i >= m || j < 0 || j >= n || sum(i,j) > k || flag[i][j]) return 0;

        // 当前位置标记为已经走过
        flag[i][j] = true;

        // 回溯
        return 1 + dfs(i+1,j,k) + dfs(i,j+1,k);
    }

    private int sum(int i, int j) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }

        while (j > 0) {
            sum += j % 10;
            j /= 10;
        }

        return sum;
    }


}
