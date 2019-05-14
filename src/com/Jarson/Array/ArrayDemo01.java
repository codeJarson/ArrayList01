package com.Jarson.Array;

/**
 * @author shkstart
 * @create 2019-05-14 16:31
 */
//数组的定义
public class ArrayDemo01 {


        public static void main(String[] args){
            //对象数组，该长度一开始就是固定的，之后不能改变
            Student[] students = {new Student(1,"张三丰"),
                                    new Student(2,"张翠山"),
                                    new Student(3,"张无忌")
            };
            //注：引用类型的对象数组有地址，因当中的toString方法
                    //如果我们想输出里面的值，则重写toString方法
                    for (int i = 0; i < students.length; i++) {
                        System.out.println(students[i]);
            }

        }


}
