package com.leetcode.hot;

public class hot5最长回文子串 {

    public static void main(String[] args) {
        String str = "babad";
        String s = longestPalindrome(str);

        System.out.println(s);
    }

    public static String longestPalindrome(String s) {
        // 获取字符串的长度
        int length = s.length();

        // 初始化dp数组
        boolean[][] dp = new boolean[length][length];

        // 将数组的对角线全部初始化为true
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        // 用max标志标记最大回文字符串的长度  用start表示最大回文字符串的起始位置
        int max = 1;
        int start = 0;
        int end = 0;

        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                // 判断首位字符串是否相等
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }


                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
