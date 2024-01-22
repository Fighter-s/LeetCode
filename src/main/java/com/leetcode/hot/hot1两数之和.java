package com.leetcode.hot;

import java.util.HashMap;
import java.util.Map;

public class hot1两数之和 {

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < length; i++){
            int num = target - nums[i];

            if(map.get(num) == null){
                return new int[]{i,map.get(num)};
            }else {
                map.put(nums[i],i);
            }
        }

        return new int[]{};
    }


}
