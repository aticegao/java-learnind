package com.two;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.eat();
        s1.study();
        s1.sleep();
        Teacher t1 =new Teacher();
        t1.setName("李四");
        t1.eat();
        t1.teach();
        t1.sleep();
    }
}
