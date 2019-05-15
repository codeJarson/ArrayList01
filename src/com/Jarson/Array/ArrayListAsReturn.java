package com.Jarson.Array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jarson
 * @create 2019-05-15 13:37
 */
/*
   题目：
        用一个集合A存放20个随机整数，然后筛选当中的偶数，并放入到集合B中，并返回值。
       要求要自定义方法筛选。
   思路：
        用一个集合A存放20个随机整数     ArrayList<Integer> listA ,随机整数：random类型对象，20个（for循环）
        自定义方法筛选：                evenChoose（ArrayList<Integer> list）
        并放入到集合B中                ArrayList<Integer> listB中add（）
 */

public class ArrayListAsReturn {

    public static void main(String[] args){
        ArrayList<Integer> listA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
                listA.add(num);
        }
        ArrayList<Integer> result = evenChoose(listA);
        System.out.println(result);

    }

        public static ArrayList<Integer>  evenChoose(ArrayList<Integer> list){
            ArrayList<Integer> listB = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                int count = list.get(i);

                    if(count % 2 ==0){
                        listB.add(count);
                }
            }
            System.out.println("获取到的偶数："+listB.size());
                return listB;
        }
}
