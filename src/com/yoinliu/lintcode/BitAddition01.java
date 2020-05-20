package com.yoinliu.lintcode;

/**
 * 计算a和b的值，使用位运算
 */
public class BitAddition01 {

    public static int add(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(3,5));
    }
}
