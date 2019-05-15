package com.Jarson.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jarson
 * @create 2019-05-15 15:04
 */
/*
   练习集合中基本用法
 */

public class ListBasicMethod {
        public static void main(String[] args){
        basicMethod();


        }

        public static void basicMethod(){
            //以多态的方式创建对象
            List<String> listA = new ArrayList<>();
            List<String> listB = new ArrayList<>();
                listA.add("a1");
                listA.add("a2");
                listA.add("a3");

                listB.add("a1");
               // listB.add("b2");
                //listB.add("b3");
                //测试addAll  把listB中的元素全部添加到listA中
                //listA.addAll(listB);
            System.out.println(listA);
                //removeall把与listB相关的移除掉
                //listA.removeAll(listB);
            System.out.println(listA);

            //取两个集合的交集
            //listA.retainAll(listB);
            System.out.println(listA);

            //boolean类型  判断是否包含listB中所有的元素
            System.out.println(listA.containsAll(listB));
        }

}
