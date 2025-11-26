package com.four;

public class Test {
    public static void main(String[] args) {
        Dog  dog= new Dog("狗", 3);
        System.out.println(dog.getName()+" "+dog.getAge());
        dog.eat();
        dog.sleep();
        dog.swim();
        Cat cat = new Cat("猫" ,4);
        System.out.println(cat.getName()+" "+cat.getAge());
        cat.eat();
        cat.sleep();
        Frog frog = new Frog("青蛙", 2);
        System.out.println(frog.getName()+" "+frog.getAge());
        frog.eat();
        frog.sleep();
        frog.swim();


    }
}
