package com.leetcode;

/**
 * @author shiguangpeng
 * @date 2023/9/6 19:03
 */
public class Solution165比较版本号 {
    public static int compareVersion(String version1, String version2) {
        // 将字符串按照。切分
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int i = 0, j = 0;

        while (i < ver1.length || j < ver2.length) {
            int num1 = 0, num2 = 0;
            if (i < ver1.length) {
                num1 = Integer.parseInt(ver1[i++]);
            }
            if (j < ver2.length) {
                num2 = Integer.parseInt(ver2[j++]);
            }

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        compareVersion("0.1", "1.1");
    }
}
