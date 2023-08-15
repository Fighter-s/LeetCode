package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        // 将数组进行排序
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        int length = nums.length;

        for (int i = 0; i < length - 2; i++) {
            // 防止出现重复数字
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 获取当前的数字
            int num = nums[i];
            // 指定左边的下标
            int left = i + 1;
            // 指定右边的下标
            int right = length - 1;

            // 判断数组越界
            while (left < right) {
                int sum = num + nums[left] + nums[right];
                // 找到数字
                if (sum == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(num);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    // 防止出现重复再次判断下一个位置的数字是否和当前的位置的数字重复
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return res;
    }
}
