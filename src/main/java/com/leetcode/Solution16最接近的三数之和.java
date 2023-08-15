package com.leetcode;

import java.util.Arrays;

public class Solution16最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];

        int length = nums.length;

        for(int i = 0 ; i < length-2 ; i++){
            int num = nums[i];
            int left = i+1;
            int right = length -1;

            while(left < right){
                int sum = num + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(res-target)){
                    res = sum;
                }

                if(sum > target){
                    right --;
                }else if (sum < target){
                    left++;
                }else{
                    return sum;
                }
            }
        }

        return res;
    }
}
