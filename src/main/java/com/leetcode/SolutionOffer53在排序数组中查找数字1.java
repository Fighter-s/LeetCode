package com.leetcode;

public class SolutionOffer53在排序数组中查找数字1 {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int count = 0;
        for(int i = 0; i < length; i++){
            if(nums[i] == target){
                count++;
            }
        }
        return count;
    }
}
