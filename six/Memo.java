package com.six;

import java.util.ArrayList;
import java.util.Scanner;

public class Memo {


    public static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("欢迎使用备忘录");
        System.out.println("1.添加待办事项");
        System.out.println("2.删除待办事项");
        System.out.println("3.修改待办事项");
        System.out.println("4.退出");
        System.out.println("请输入操作序号");
        list.add("吃饭");
        list.add("学习");
        list.add("午休");
        list.add("学习");
        list.add("睡觉");
        Scanner Scanner = new Scanner(System.in);
        int num = Scanner.nextInt();
        switch (num) {
            case 1:
                addMemo();
                break;
            case 2:
                deleteMemo();
                break;
            case 3:
                updateMemo();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("输入错误");
                break;

        }




    }

    private static void addMemo() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println( "输入要添加的代办事项");
        String memo = Scanner.nextLine();
        System.out.println("输入要添加的优先级");
        int level = Scanner.nextInt();
        System.out.println("添加成功");

        list.add(level,memo);
        System.out.println(list);


    }

    private record Result(String memo, int level) {
    }


    public static void deleteMemo() {
        //删除数据
        System.out.println("输入要删除的待办事项");
        Scanner Scanner = new Scanner(System.in);
        String memo = Scanner.nextLine();
        list.remove(memo);
        System.out.println("删除成功");
        System.out.println(list);
    }
    public static void updateMemo() {
        //修改数据
        System.out.println("输入要修改的待办事项");
        Scanner Scanner = new Scanner(System.in);
        String memo = Scanner.nextLine();
        System.out.println("输入要修改的优先级");
        int level = Scanner.nextInt();
        System.out.println("修改成功");
        list.set(level,memo);
        System.out.println(list);

    }
}
