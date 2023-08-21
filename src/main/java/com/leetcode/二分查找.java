package com.leetcode;

public class 二分查找 {
    public static void main(String[] args) {

    }

    private int binarySearch(int[] nums, int target){
        int left = 0;
        int length = nums.length;
        int right = length - 1;

        int mid = left + (right - left) / 2;

        if(nums[mid] > target){
            right = mid -1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        }else {
            return mid;
        }
        return 0;
    }
}
