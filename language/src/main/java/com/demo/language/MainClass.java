package com.demo.language;

import javax.smartcardio.ATR;

import sun.rmi.runtime.Log;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("程序开始运行");
        compare();
    }

    private static void compare() {
        String a = "abc";
        String b = "abc";
        String c = "abcd".substring(0, 3);

        println(a == b);
        println(a.hashCode() == b.hashCode());
        println(a.equals(b));

        println(a == c);
        println(a.hashCode() == c.hashCode());
        println(a.equals(c));

        println(a.hashCode());
    }

    static void println(Object content) {
        System.out.println(content);
    }
}