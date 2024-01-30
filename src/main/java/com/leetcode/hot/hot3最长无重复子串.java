package com.leetcode.hot;

import java.util.HashMap;
import java.util.Map;

/**
 * 双指针 + 滑动窗口
 */
public class hot3最长无重复子串 {
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int left = 0;
        int right = 0;
        int max = 0;

        Map<Character,Integer> map = new HashMap<>();

        while(right < length){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
                map.put(s.charAt(right),right);
            }else {
                map.put(s.charAt(right),right);
            }
            max = Math.max(max,(right-left) + 1);

            right ++;
        }

        return max;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abba");
    }
}
