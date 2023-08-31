package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shiguangpeng
 * @date 2023/8/31 14:28
 */
public class Solution560和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
        // 计算前缀和
        int[] sum = new int[nums.length + 1];
        int s = 0;

        for(int i = 1; i <= nums.length ; i++){
            sum[i] = sum[i-1] + nums[i-1];
        }

        int count = 0;

        // 创建hashMap
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<=nums.length;i++){
            int target = sum[i] - k;
            if(map.containsKey(target)){
                count += map.get(target);
            }

            map.put(sum[i],map.getOrDefault(sum[i],0)+1);

        }

        return count;
    }
}
