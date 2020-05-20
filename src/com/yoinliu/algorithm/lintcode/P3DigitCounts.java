package com.yoinliu.algorithm.lintcode;

/**
 * 统计数字
 * 计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0~9 的一个值。
 * 统计所有数字每一位包含k的个数。
 * 通过观察可知，每10个数包含一个在个位的k，每100个数包含10个在十位的k，1000个包含100个在百位的k，以此类推。
 * 直接/10/100...去统计，最后补充剩下的不足10（100/1000）个数中的k
 * k = 0的情况特殊处理
 */
public class P3DigitCounts {
    public static int digitCounts(int k, int n){
        int count = 0;
        int base = 1;
        int high = 0;
        int low = 0;
        int value = 0;
        if(k != 0){
            while(n / base > 0){
                high = n / base / 10;
                low = n % base;
                value = n / base % 10;
                count += high * base;
                if(value == k){
                    count += low +1;
                }else if(value > k){
                    count += base;
                }
                base *= 10;
            }
        }else{
            count += 1;
            while(n / base > 0){
                high = n / base / 10;
                if(high == 1){
                    count += 1;
                }else{
                    count += high * base;
                }
                base *= 10;
            }
        }
        return count;
    }
}
