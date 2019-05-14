package com.Jarson.Array;

import java.util.ArrayList;

/**
 * @author Jarson
 * @create 2019-05-14 17:40
 */
/*
   练习：
        定义制定格式打印集合的方法（ArrayList作为参数）， 使用{}扩起集合，使用@分隔每个元素。
        格式{元素@元素@元素}
    思路:
         1.定义一个打印集合方法且带有参数，则无返回值void
         2.通过for循环输出集合当中的值并且做出判断

 */

public class ArrayListPrint {

        public static void main(String[] args){
            ArrayList<String> list = new ArrayList<>();
                    list.add("乔鲁诺");
                    list.add("承太郎");
                    list.add("迪奥");
            ArrayListPrint(list);
        }
        //通用的数组集合打印
    public static void ArrayListPrint(ArrayList list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Object count  = list.get(i);
            if(i ==list.size()-1){  //list.size（）为3，减1，代表着该集合的最后一个值  则i=2，list【i=2】
                System.out.print(count);    //就输出结果，不需加@
            }else{
                System.out.print(count+"@");
            }
        }


        System.out.println("}");


    }
}
