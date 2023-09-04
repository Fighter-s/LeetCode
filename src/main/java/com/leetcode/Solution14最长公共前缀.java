package com.leetcode;

public class Solution14最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;

        while(index < strs[0].length()){
            char target = strs[0].charAt(index);

            boolean flag = false;

            for(int i = 1; i < strs.length; i++){
                if(!flag && (index >= strs[i].length() || target != strs[i].charAt(index))){
                    flag = true;
                }
            }

            if(flag){
                return strs[0].substring(0,index);
            }
            index ++;
        }

        return strs[0].substring(0,index);
    }
}
