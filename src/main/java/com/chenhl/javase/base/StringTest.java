package com.chenhl.javase.base;

import java.util.Arrays;

/**
 * String类源码分析
 */
public class StringTest {

    public static void main(String[] args) throws Exception {

        String s = "abc";

        int[] ints = {97, 98, 99};

        String str = new String(ints, 0, ints.length);

        System.out.println(str);

        String s1 = "你好，世界！";
        System.out.println(Arrays.toString(s1.getBytes()));

        System.out.println(Arrays.toString(s1.getBytes("UTF-8")));

    }
}

/*

 */
