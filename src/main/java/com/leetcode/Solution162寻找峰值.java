package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/8/23 12:36
 */
public class Solution162寻找峰值 {

    public int findPeakElement(int[] nums) {
        int length = nums.length;

        int left = 0;
        int right = length -1 ;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[mid+1]){
                // 峰值在右边
                left = mid+1;
            }else{
                // 峰值在左边
                right = mid;
            }
        }

        return left;
    }
}
