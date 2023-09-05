package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution187重复的DNA序列 {
    public List<String> findRepeatedDnaSequences(String s) {

        // 定义一个HashSet用来存储已经出现过的值
        Set<String> set = new HashSet<>();
        // 用来存储已经存在的结果，防止重复的结果放入list中
        Set<String> strSet = new HashSet<>();

        List<String> res = new ArrayList<>();


        for(int i = 0; i + 9<s.length() ; i++){
            String str = s.substring(i,i+10);

            if(set.contains(str) && !strSet.contains(str)){
                strSet.add(str);
                res.add(str);
            }

            set.add(str);
        }

        return res;
    }
}
