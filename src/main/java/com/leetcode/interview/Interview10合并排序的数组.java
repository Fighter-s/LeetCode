package com.leetcode.interview;

public class Interview10合并排序的数组 {
    public void merge(int[] A, int m, int[] B, int n) {
        // 创建一个新数组用来保存顺序结果
        int[] res = new int[m+n];
        int index = 0;
        int a = 0;
        int b = 0;

        // 将两个数组中都有的数据进行比较之后，弄到新数组中
        while(a < m && b < n){
            if(A[a] < B[b]){
                res[index] = A[a];
                a++;
            }else {
                res[index] = B[b];
                b++;
            }
            index++;
        }

        // A数组越界，将B数组中剩余数据弄到新数组中
        if(a >= m){
            while(b < n){
                res[index] = B[b];
                b++;
                index++;
            }
        }

        // B数组越界，将A数组中剩余的数据弄到新数组中
        if(b >= n){
            while(a < m){
                res[index] = A[a];
                a++;
                index++;
            }
        }

        // 把新数组中数据倒腾到A数组中
        for(int i = 0; i < m+n;i++){
            A[i] = res[i];
        }
    }
}
