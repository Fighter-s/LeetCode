package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution56合并区间 {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        // 获取数组的长度
        int length = intervals.length;

        // 现将数组排序
        Arrays.sort(intervals,(x,y) -> x[0] - y[0]);

        for(int i = 0 ; i < length; i++){
            // 获取当前数组的第一个值和第二个值
            int left = intervals[i][0];
            int right = intervals[i][1];

            while(i < length-1 && right >= intervals[i+1][0] ){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            list.add(new int[]{left,right});
        }

        return list.toArray(new int[0][]);
    }
}
