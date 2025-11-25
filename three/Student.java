package com.three;

public class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }
    @Override
    public void show() {
        System.out.println("基本信息为"+getName()+" "+getAge());
    }

}
