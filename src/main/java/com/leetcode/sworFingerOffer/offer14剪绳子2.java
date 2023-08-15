package com.leetcode.sworFingerOffer;

import java.math.BigInteger;

public class offer14剪绳子2 {
    public int cuttingRope(int n) {
        if(n == 2) return 1;

        if(n == 3) return 2;

        BigInteger[] aa = new BigInteger[n+1];

        aa[1] = BigInteger.ONE;
        aa[2] = BigInteger.valueOf(2);
        aa[3] = BigInteger.valueOf(3);

        for(int i = 4;i<=n;i++){
            aa[i] = BigInteger.ZERO;
            for(int j = 1;j<=i/2;j++){
                BigInteger a = aa[j].multiply(aa[i-j]);
                BigInteger b = aa[j].multiply(BigInteger.valueOf(i-j));
                aa[i] = aa[i].max(a.max(b));
            }
        }

        return aa[n].mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
