package com.Jarson.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Jarson
 * @create 2019-05-14 16:54
 */
//数组集合的基本用法
public class ArrayListDemo {
    public static void main(String[] args){
        //该数组集合指String类型的数组集合
            ArrayList<String> list = new  ArrayList<>();
                list.add("Jarson");
                list.add("Mike");
                list.add("Tony");
        System.out.println(list);
                //快捷键list.fori   生成数组的for循环
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }
        String remove = list.remove(1);
        System.out.println("被删除的人："+remove);
    }
}
