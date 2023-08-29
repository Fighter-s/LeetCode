package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shiguangpeng
 * @date 2023/8/29 12:32
 */
public class Solution76最小覆盖子串 {

    public String minWindow(String s, String t) {
        // 创建map用来存储字符的个数
        Map<Character,Integer> tMap = new HashMap<>();

        // 创建map用来存储遍历s的字符个数
        Map<Character,Integer> sMap = new HashMap<>();

        // 遍历t字符串
        for(int i = 0; i < t.length();i++){
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
        }

        int count = 0;
        int len = s.length() + 1;
        String res = "";

        // 遍历s字符串
        char[] chars = s.toCharArray();
        for(int i = 0,j = 0; j < chars.length;j++){
            sMap.put(s.charAt(j), sMap.getOrDefault(s.charAt(j), 0)+1);

            // 判断这个字符是否在tMap中存在并且sMap的数量<=tMap中数量
            if(tMap.containsKey(chars[j]) && sMap.get(chars[j])  <= tMap.get(chars[j] )){
                count++;
            }

            // 将left中不是tMap中的右移
            while((i < j && !tMap.containsKey(chars[i])) || (tMap.containsKey(chars[i]) && sMap.get(chars[i]) > tMap.get(chars[i]))){
                sMap.put(chars[i],sMap.get(chars[i])-1);
                i++;
            }

            if(count == t.length() && len > (j-i)+1){
                len = j-i+1;
                res = s.substring(i,j+1);
            }
        }

        return res;
    }
}
