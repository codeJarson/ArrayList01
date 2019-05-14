package com.Jarson.Array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jarson
 * @create 2019-05-14 17:16
 */
/*
    练习：
        生成6个1-33间的随机整数，添加到集合，并遍历集合。
    思路：
        1.生成6个 1-33间的随机整数

            通过for循环6次，产生6个整数
            random类中的nextInt方法，默认[0,1)
        2，添加到集合
            ArrayList<Integer>.add()
        3.遍历集合
            list.for
 */
public class ArrayListRandom {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i <6 ; i++) {
                    //注nextInt当中的参数bound表示[0,33),不包含33,所以需要加上1[1,34)代表【1,33】
            int count = r.nextInt(33)+1;
                list.add(count);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
