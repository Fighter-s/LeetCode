package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/8/31 18:23
 */
public class Solution33搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid;
            }

            // 判断左边有序还是右边有序
            if(nums[left] <= nums[mid]){
                // 左边有序
                if(nums[left] <= target && target < nums[mid]){
                    right = mid-1;
                }else {
                    left = mid +1;
                }
            }else {
                // 右边有序
                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }else {
                    right = mid -1;
                }
            }
        }

        return -1;
    }
}
