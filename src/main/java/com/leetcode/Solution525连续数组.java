package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution525连续数组 {
    public int findMaxLength(int[] nums) {
        // 获取数组的长度
        int length = nums.length;
        // 设置初始最长为0
        int maxLength = 0;
        // 创建一个数组用来保存前缀和
        int[] sum = new int[length+1];

        // 计算前缀和
        for(int i =1 ; i < length+1;i++){
            sum[i] = sum[i-1] + (nums[i-1] == 0 ? -1 : 1);
        }

        // 创建一个map用来存储前n数字的前缀和,map中保存的也是最小的index的前缀和
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i = 1; i < length+1;i++){
            if(map.containsKey(sum[i])){
                // 说明第j个前缀和和第i个前缀和相减 == 0  满足条件
                maxLength = Math.max(maxLength,i - map.get(sum[i]));
            }else{
                map.put(sum[i],i);
            }
        }

        return maxLength;
    }
}
