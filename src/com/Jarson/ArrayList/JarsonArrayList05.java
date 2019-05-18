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
          新增set，get方法并检查索引的范围
          新增remove方法
    add（）思路：
        1.什么时候扩容？
            当你add的东西到达与数组长度相同的时候，则需判断，扩容
            if（size == dataElement.length）

        2.如何扩容？
            相当于数组的拷贝，将原始数组的元素拷贝到新数组中
                System.arrayCopyof（）
    remove（）思路：
        1.如何移除？(通过元素来进行移除，可当中还会涉及到索引)
            传进的参数与数组中的元素挨个比较，若相同，则调用通过索引来移除的方法
        2.（通过索引来移除）？
            数组的拷贝
            将最后一个元素置空
 */
public class JarsonArrayList05<E> {
    //定义两个私有变量，
    private Object[] dataElement;
    private  int size;
    private  static final int DEFUALT_NUM = 10;
    //无参构造方法
    public JarsonArrayList05(){
        dataElement = new Object[DEFUALT_NUM];
    }
    public JarsonArrayList05(int repalceNum){
                if(repalceNum<0){
            throw new RuntimeException("输入长度不合法："+repalceNum);
        }else if(repalceNum==0){
            dataElement = new Object[DEFUALT_NUM];
        }else{
            dataElement  = new Object[repalceNum];
        }
    }

        //size方法
        public int size(){
            return size;
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
    //指定当中元素移除
    public Boolean remove(E element){
        for (int i = 0; i <size; i++) {
            if(element.equals(get(i))){ //作比较
                remove(i);//调用第二个真正处理移除的方法
                return true;
            }

        }
            return false;
    }
    //通过索引移除数组元素
    public void remove(int index){
        //数组的拷贝操作
        //a,b,c,d,e,f,g     移除掉索引为3的元素
        //a,b,c,e,f,g,null     最后一个元素则置空
        int numMoved = size-index-1;    //总长度-索引值-1
        if(numMoved >0){
            System.arraycopy(dataElement,index+1,dataElement,index,numMoved);
        }
        dataElement[--size] = null; //将最后一个元素则置空

    }

    //get方法
    public E get(int index){
        //get前先判断所输入的索引是否正确
        checkRange(index);
        //通过索引来获取数组中的相对应的值
        return (E)dataElement[index];
    }
    //set方法
    public void set(E element,int index){
        //set前先判断所输入的索引是否正确
        checkRange(index);
        //把输入的泛型内容赋值给相对应索引的数组当中的内容
        dataElement[index] = element;
    }
    //检察索引范围的方法
        public void checkRange(int index){
        if(index<0||index>size){
            throw new RuntimeException("索引输入不合法："+index);
        }
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
        JarsonArrayList05<String> j1 = new JarsonArrayList05<>();   //默认长度为10
            for (int i = 0; i<20;i++){
                j1.add("Jarson"+i);
            }
        System.out.println(j1);
        System.out.println(j1.get(2));
        j1.set("GOGO",1);
        System.out.println(j1);
        j1.remove("Jarson5");
        System.out.println(j1);
        System.out.println(j1.size());


    }
}
