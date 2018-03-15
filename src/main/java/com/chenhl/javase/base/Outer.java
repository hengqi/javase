package com.chenhl.javase.base;

/**
 * 内部类不能含有静态的声明
 * 静态方法不能包含非静态的方法
 */
class Outer {

//     class Inner {
    static class Inner {
        public static void foo() {
            new Inner();
        }

        public void bar(){
            new Inner();
        }

        public static void main(String[] args) {
            new Inner();
        }
    }
}
