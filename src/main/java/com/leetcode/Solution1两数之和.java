package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        // 创建一个map数组，用来存储数组中的值和下标
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        int length = nums.length;

        for(int i = 0; i < length; i++){
            int num = target - nums[i];
            if(map.get(num) == null){
                map.put(nums[i],i);
                continue;
            }
            return new int[]{i,map.get(num)};
        }

        return null;
    }
}
