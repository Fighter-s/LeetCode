package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/9/1 14:30
 */
public class Solution34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first,last};
    }

    private int findFirst(int[] nums, int target){
        int length = nums.length;

        int left = 0;
        int right = length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] > target){
                right = mid-1;
            }else if (nums[mid] < target){
                left = mid +1;
            }else{
                if(mid == 0 || nums[mid] != nums[mid-1]){
                    return mid;
                }
                right = mid - 1;
            }
        }

        return -1;
    }

    private int findLast(int[] nums, int target){
        int length = nums.length;

        int left = 0;
        int right = length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] > target){
                right = mid-1;
            }else if (nums[mid] < target){
                left = mid +1;
            }else{
                if(mid == length-1 || nums[mid] != nums[mid+1]){
                    return mid;
                }
                left = mid + 1;
            }
        }

        return -1;
    }
}
