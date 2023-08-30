package com.leetcode;

public class Solution238除自身以外数组的乘积 {

    public int[] productExceptSelf(int[] nums) {
        // 创建一个数组
        int[] res = new int[nums.length];

        int k = 1;

        // 计算当前节点左边的乘积
        for(int i = 0; i < nums.length;i++){
            res[i] = k;
            k = k * nums[i];
        }

        // 计算当前节点右边的乘积，并且和左边的乘积想×
        int m = 1;
        for(int i = nums.length-1; i >=0; i-- ){
            res[i] = res[i]* m;
            m = m * nums[i];
        }

        return res;
    }
}
