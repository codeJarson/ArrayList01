package com.Jarson.ArrayList;

/**
 * @author Jarson
 * @create 2019-05-15 15:57
 */
/*
    自定义一个ArrayList，体会底层原理实现
    深入，添加泛型ArrayList<E>
 */
public class JarsonArrayList02<E> {
    //定义两个私有变量，
    private Object[] dataElement;
    private  int size;
    private  static final int DEFUALT_NUM = 10;
    //无参构造方法
    public JarsonArrayList02(){
        dataElement = new Object[DEFUALT_NUM];
    }
    public JarsonArrayList02(int repalceNum){
        dataElement = new Object[repalceNum];
    }

    public boolean add(E element){
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
        JarsonArrayList02<String> j1 = new JarsonArrayList02<>();
        j1.add("咏春");
        j1.add("洪拳");
        System.out.println(j1);
    }
}
