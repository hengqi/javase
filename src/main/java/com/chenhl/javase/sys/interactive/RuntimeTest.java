package com.chenhl.javase.sys.interactive;

public class RuntimeTest {

    public static void main(String[] args) throws Exception{
        // 单例类
        Runtime runtime = Runtime.getRuntime();

        System.out.println("处理器核数：" + runtime.availableProcessors());

        System.out.println("空闲内存数：" + runtime.freeMemory() / 1024 / 1024);

        System.out.println("总内存数：" + runtime.totalMemory() / 1024 / 1024);

        System.out.println("可用最大内存数：" + runtime.maxMemory() / 1024 / 1024);

        // 直接启动一个进程运行操作系统的命令
        runtime.exec("notepad.exe");

    }
}
