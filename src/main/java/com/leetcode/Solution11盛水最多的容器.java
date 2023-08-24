package com.leetcode;

public class Solution11盛水最多的容器 {
    public int maxArea(int[] height) {
        int length = height.length;

        int left = 0;
        int right = length - 1;

        int max = 0;

        while (left < right) {
            if (height[left] > height[right]) {
                int sum = height[right] * (right - left);
                max = Math.max(max, sum);
                right--;
            } else {
                int sum = height[left] * (right - left);
                max= Math.max(max, sum);
                left++;
            }
        }

        return max;
    }
}
