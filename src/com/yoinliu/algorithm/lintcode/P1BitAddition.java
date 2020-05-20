package com.yoinliu.algorithm.lintcode;

/**
 * A + B 的问题
 * 计算a加b的值，使用位运算
 */
public class P1BitAddition {

    public static int add(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }
}
