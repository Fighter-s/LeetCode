package com.leetcode.hot;

public class hot11盛水最多的容器 {
    public int maxArea(int[] height) {
        // 获取数组长度
        int length = height.length;

        int max = 0;

        int left = 0;
        int right = length - 1;

        while (left < right) {
            if (height[left] > height[right]) {
                int s = height[right] * (right - left);
                max = Math.max(max, s);
                right--;
            } else {
                int s = height[left] * (right - left);
                max = Math.max(max, s);
                left++;
            }
        }

        return max;
    }
}
