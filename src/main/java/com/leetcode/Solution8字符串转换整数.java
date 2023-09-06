package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/9/6 20:29
 */
public class Solution8字符串转换整数 {
    public int myAtoi(String s) {
        // 去除空格
        s = s.trim();

        if(s.length() == 0) return 0;

        // 判断第一个字符是否为 '+' '-'
        int index = 0;
        int flag = 1;
        if (s.charAt(0) == '-') {
            index = 1;
            flag = -1;
        } else if (s.charAt(0) == '+') {
            index = 1;
        }

        int res = 0;

        // 遍历字符串中的所有字符
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                break;
            }
            int num = s.charAt(i) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && num > 7))
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            res = res * 10 + num;
        }

        return res * flag;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
