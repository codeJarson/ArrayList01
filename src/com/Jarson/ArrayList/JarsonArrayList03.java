package com.Jarson.ArrayList;

import java.util.ArrayList;

/**
 * @author Jarson
 * @create 2019-05-15 15:57
 */
/*
    自定义一个ArrayList，体会底层原理实现
    深入，添加泛型ArrayList<E>
          尝试完善ArrayList集合，数组扩容
    思路：
        1.什么时候扩容？
            当你add的东西到达与数组长度相同的时候，则需判断，扩容
            if（size == dataElement.length）

        2.如何扩容？
            相当于数组的拷贝，将原始数组的元素拷贝到新数组中
                System.arrayCopyof（）
 */
public class JarsonArrayList03<E> {
    //定义两个私有变量，
    private Object[] dataElement;
    private  int size;
    private  static final int DEFUALT_NUM = 10;
    //无参构造方法
    public JarsonArrayList03(){
        dataElement = new Object[DEFUALT_NUM];
    }
    public JarsonArrayList03(int repalceNum){
        dataElement = new Object[repalceNum];
    }

    //add方法
    public boolean add(E element){
            //什么时候扩容？
            if (size == dataElement.length){
                //扩容操作
                    Object[] newArray = new Object[dataElement.length+(dataElement.length>>1)];//原数组的长度+原数组的长度除2
                        //原数组，（原数组）拷贝的起始点，新数组，拷贝到的起始点，长度（拷多少）
                System.arraycopy(dataElement,0,newArray,0,dataElement.length);
                dataElement = newArray;

            }

        dataElement[size++] = element;
        return true;
    }
        //重写父类的toString方法
    @Override
    public String toString() {
       //通过StringBuilder自定义追加各种类型的语句[a,b,c]
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <size ; i++) {
            sb.append(dataElement[i]+",");

        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args){
        JarsonArrayList03<String> j1 = new JarsonArrayList03<>();   //默认长度为10
            for (int i = 0; i<200;i++){
                j1.add("Jarson"+i);
            }
        System.out.println(j1);
    }
}
