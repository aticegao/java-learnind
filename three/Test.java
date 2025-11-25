package com.three;

public class Test {
    public static void main(String[] args) {
        Administrator a = new Administrator("张三", 34);
        Student s = new Student("李四", 18);

        register(a);
        register(s);

    }

    public static void register(Person p) {
        p.show();
    }
}

