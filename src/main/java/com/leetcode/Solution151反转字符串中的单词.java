package com.leetcode;

public class Solution151反转字符串中的单词 {
    public String reverseWords(String s) {
        // 将字符串按照空格切分
        String[] strs = s.split(" ");

        StringBuilder builder = new StringBuilder();

        // 遍历字符串
        for(int i = strs.length-1; i >=0; i--){
            if("".equals(strs[i])) continue;
            builder.append(strs[i]);
            builder.append(" ");
        }

        return builder.toString().trim();
    }
}
