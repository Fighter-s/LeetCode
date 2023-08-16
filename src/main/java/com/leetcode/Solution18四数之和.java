package com.leetcode;

import java.util.List;

public class Solution18四数之和 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length == 4){
            int aa = nums[1] + nums[2] + nums[0] + nums[3];
            if(aa != target) return new ArrayList<>();
        }
// 将数组排序
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        int length = nums.length;

        for(int i = 0 ; i < length -3; i++){
            if(i !=0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < length -2;j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                int num1 = nums[i];
                int start = j+1;
                int end = length-1;

                while(start < end){
                    long sum = (long)num1 + nums[j] + nums[start] + nums[end];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(num1);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        res.add(list);
                        while(start < end && nums[start] == nums[start+1]) start++;
                        while(start < end && nums[end] == nums[end-1]) end --;
                        start++;
                        end --;
                    }else if(sum < target){
                        start++;
                    }else{
                        end --;
                    }
                }
            }
        }

        return res;
    }
}
