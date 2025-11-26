package com.four;

public class Dog extends  Animal implements Swim{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep");

    }

    @Override
    public void swim() {
        System.out.println("dog swim");

    }
}
