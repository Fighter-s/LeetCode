package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/8/30 11:45
 */
public class Solution1894找到需要补充粉笔的学生编号 {
    public int chalkReplacer(int[] chalk, int k) {
        long count = 0;
        for (int i = 0; i < chalk.length; i++) {
            count += chalk[i];

        }

        k = (int) (k % count);

        for (int i = 0; i < chalk.length; i++) {
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }

        return 0;
    }
}
