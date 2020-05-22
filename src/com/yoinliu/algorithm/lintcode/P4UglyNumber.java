package com.yoinliu.algorithm.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 丑数
 * 找出只含素因子2，3，5 的第 n 小的数。
 * 1也是一个丑数
 */
public class P4UglyNumber {

    public static int uglyNumber(int n){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int n2 = 0;
        int n3 = 0;
        int n5 = 0;
        int value = 0;
        while(list.size() < n){
            i2 = list.get(n2) * 2;
            i3 = list.get(n3) * 3;
            i5 = list.get(n5) * 5;
            value = Math.min(i2, Math.min(i3, i5));
            list.add(value);
            if(value == i2) n2++;
            if(value == i3) n3++;
            if(value == i5) n5++;
        }
        return list.get(list.size() - 1);
    }


}
