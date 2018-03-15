package com.chenhl.javase.base;

/**
 * Object类源码分析
 */
public class ObjectTest {

    public static void main(String[] args) {
        String s = "abc";
        Class<? extends String> clazz = s.getClass();
        System.out.println(clazz);
    }
}

