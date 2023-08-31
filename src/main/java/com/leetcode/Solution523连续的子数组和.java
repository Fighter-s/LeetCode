package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shiguangpeng
 * @date 2023/8/31 16:49
 */
public class Solution523连续的子数组和 {

    public boolean checkSubarraySum(int[] nums, int k) {
        // 计算前缀和
        int[] sum = new int[nums.length + 1];

        for(int i = 0; i < nums.length;i++){
            sum[i+1] = sum[i]+nums[i];
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 2; i <= nums.length;i++){
           set.add(sum[i-2] % k);
           if(set.contains(sum[i] % k)) return true;
        }
        return false;
    }
}
