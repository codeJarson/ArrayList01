package com.Jarson.Array;

/**
 * @author Jarson
 * @create 2019-05-14 16:35
 *
 */
//实体类
public class Student {
    private int id ;
    private  String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+"--"+this.name+"-";
    }
}
