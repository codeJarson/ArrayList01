package com.Jarson.Array;

import java.util.ArrayList;

/**
 * @author Jarson
 * @create 2019-05-14 17:30
 */
/*
   练习：
        自定义4个学生对象，添加到集合，并遍历
    思路：
        1.首先，需要个学生实体类Entity     class Student
        2.创建学生类对象                   new Student()
        2.创建Student类型的数组集合，     ArrayList<Student> list(只能存放Student类型的对象，数据)
        3.把创建的学生对象放入到集合中     list.add()
        4.遍历  lsit.for
 */
public class ArrayListStu {
    public static void main(String[] args){
        Student stu1  = new Student(1,"叶问");
        Student stu2  = new Student(2,"张天志");
        Student stu3  = new Student(3,"李小龙");

        ArrayList<Student> list = new ArrayList<>();
            list.add(stu1);
            list.add(stu2);
            list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
