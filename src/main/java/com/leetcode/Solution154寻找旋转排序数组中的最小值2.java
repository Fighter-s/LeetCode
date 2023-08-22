package com.leetcode;

public class Solution154寻找旋转排序数组中的最小值2 {
    public int findMin(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = length-1;

        while(left < right){
            int mid = left + (right - left) /2;
            // 旋转点在右伴部分
            if(nums[mid] > nums[right]){
                left = mid +1;
            }else if(nums[mid] < nums[right]){
                right = mid;
            }else{
                right --;
            }
        }

        return nums[left];
    }
}
