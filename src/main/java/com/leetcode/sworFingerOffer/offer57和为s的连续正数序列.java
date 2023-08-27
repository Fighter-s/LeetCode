package com.leetcode.sworFingerOffer;

import java.util.ArrayList;
import java.util.List;

public class offer57和为s的连续正数序列 {
    public static int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 2;

        int sum = left + right;

        List<List<Integer>> res = new ArrayList<>();

        while(right < target && left < right){
            if(sum < target){
                sum += ++right ;
            } else if (sum > target) {
                sum -= left++;
            }else {
                List<Integer> list = new ArrayList<Integer>();
                for(int i = left; i <= right;i++){
                    list.add(i);
                }
                res.add(list);
                sum+=++right ;
            }
        }

        int[][] a = new int[res.size()][];

        for(int i = 0; i < res.size();i++){
            int[] b = new int[res.get(i).size()];
            for(int j = 0; j < res.get(i).size();j++){
                b[j] = res.get(i).get(j);
            }
            a[i] = b;
        }

        return a;
    }

    public static void main(String[] args) {
        int[][] continuousSequence = findContinuousSequence(9);

        System.out.println(continuousSequence.toString());
    }
}
