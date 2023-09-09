package com.leetcode;

public class Solution43字符串相乘 {

    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();

        if(num1.equals("0") ||num2.equals("0")) return "0";

        // 创建一个数组用于存储每个数字相乘的乘积
        int[] res = new int[length2+length1];

        for(int i = length1-1;i >=0; i--){
            int x = num1.charAt(i) - '0';
            for(int j = length2-1;j>=0;j--){
                int y = num2.charAt(j) - '0';
                res[i+j+1] += x*y;
            }
        }

        // 将数组中的数字进行进位操作
        for(int i = length1+length2-1;i>0;i--){
            res[i-1] += res[i]/10;
            res[i] = res[i]%10;
        }

        // 判断第一位是否为0
        int index = res[0] == 0 ? 1 : 0;
        StringBuilder builder = new StringBuilder();
        for(int i = index; i<length1+length2;i++){
            builder.append(res[i]);
        }

        return builder.toString();
    }
}
