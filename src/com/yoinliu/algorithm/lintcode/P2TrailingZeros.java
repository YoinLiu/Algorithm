package com.yoinliu.algorithm.lintcode;

/**
 * 尾部的零
 * 统计阶乘后后面0的个数
 * 尾部的零只有2 * 5才会有，而偶数都可以拆出2，所以原问题可拆解成计算5的个数
 */
public class P2TrailingZeros {
    public static long trailingZeros(long n){
        long sum = 0;
        long temp = n;
        while(temp / 5 != 0){
            sum += temp / 5;
            temp /= 5;
        }
        return sum;
    }
}
