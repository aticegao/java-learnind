package com.five;

import com.three.Student;

/**
 * 汽车类
 * 包含汽车的基本信息和展示方法
 */
public class Car {
    // 汽车名称
    String carName;
    // 汽车年龄
    int carAge;

    /**
     * 展示汽车信息的方法
     * 包括汽车本身和其引擎的信息
     */
    public void show() {
        // 打印汽车名称
        System.out.println("Car Name: " + carName);
        // 打印汽车年龄
        System.out.println("Car Age: " + carAge);
        // 创建引擎实例
        Engine e = new Engine();
        // 打印引擎名称
        System.out.println("Engine Name: " + e.engineName);
        // 打印引擎年龄
        System.out.println("Engine Age: " + e.engineAge);
    }

    /**
     * 引擎类（内部类）
     * 包含引擎的基本信息
     */
    class Engine {
        // 引擎名称
        String engineName;
        // 引擎年龄
        int engineAge;
    }
}
