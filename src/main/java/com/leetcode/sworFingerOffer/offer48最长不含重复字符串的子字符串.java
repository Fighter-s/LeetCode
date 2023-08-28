package com.leetcode.sworFingerOffer;

import java.util.HashMap;
import java.util.Map;

public class offer48最长不含重复字符串的子字符串 {
    public int lengthOfLongestSubstring(String s) {
        // 将字符串转换为字符数组
        char[] chars = s.toCharArray();
        // 创建一个Map用于存储已经存在的字符
        Map<Character,Integer> map = new HashMap<>();
        // 创建一个count用于存储不含重复字符串的长度
        int maxCount = 0;
        int left = -1;
        int right = 0;

        // 遍历字符串
        while(left <= right && right < chars.length){
            if(map.containsKey(chars[right])){
                left = Math.max(left,map.get(chars[right]));
            }
            map.put(chars[right],right);
            maxCount = Math.max(maxCount,right-left);
            right++;
        }

        return maxCount;
    }
}
