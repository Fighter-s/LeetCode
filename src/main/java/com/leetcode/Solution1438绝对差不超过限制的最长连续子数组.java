package com.leetcode;

import java.util.TreeMap;

public class Solution1438绝对差不超过限制的最长连续子数组 {

    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer, Integer>();

        int length = nums.length;

        int left = 0,right = 0;

        int maxCount = 0;

        while(right < length){
            treeMap.put(right,nums[right]);
            while(treeMap.firstKey() - treeMap.lastKey() <= limit){
                maxCount = Math.max(maxCount,right-left+1);
                left ++;
            }
            right += 1;
        }

        return maxCount;
    }
}
