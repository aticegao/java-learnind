package com.einght;

import java.sql.SQLOutput;

public class T extends  Thread{
    public void run(){
        while (true) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {



            T t = new T();
            t.start();



    }
}
