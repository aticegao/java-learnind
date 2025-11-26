package com.four;

public class Frog extends  Animal implements Swim{
    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println("Frog eat");
    }

    @Override
    public void sleep() {
        System.out.println("Frog sleep");

    }

    @Override
    public void swim() {

        System.out.println("Frog swim");
    }
}
