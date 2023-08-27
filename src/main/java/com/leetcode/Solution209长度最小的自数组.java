package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/8/25 12:39
 */
public class Solution209长度最小的自数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length+1;

        int left = 0;
        int right = 0;
        int sum = 0;

        while (left <= right && right < nums.length){
            sum += nums[right];

            while(sum >= target){
                min = Math.min(right - left+1,min);
                sum -= nums[left++];
            }
            right++;
        }

        return min == nums.length+1 ? 0 : min;
    }
}
