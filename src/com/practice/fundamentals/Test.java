package com.practice.fundamentals;
/*
This class is about usage of static and instance variables
        */
public class Test {
    int i = 10;
    static int j = 20;

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.i = 888;
        t1.j = 999;
        Test t2 = new Test();
        System.out.println(t2.i+"...."+t2.j);
    }
}
