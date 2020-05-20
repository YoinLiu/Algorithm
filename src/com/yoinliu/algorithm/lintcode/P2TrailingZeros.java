package com.yoinliu.algorithm.lintcode;

/**
 * 尾部的零
 * 统计阶乘后后面0的个数
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
