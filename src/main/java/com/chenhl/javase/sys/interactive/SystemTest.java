package com.chenhl.javase.sys.interactive;

import java.util.Map;

/**
 * 系统交互类 System
 */
public class SystemTest {

    public static void main(String[] args) throws Exception{

        // 获取系统的所有环境变量
        Map<String,String> envs = System.getenv();

        for (Map.Entry<String, String> entry : envs.entrySet()) {

            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        // 获取指定的环境变量的值
        String val = System.getenv("JAVA_HOME");
        System.out.println(val);

        // 获取所有的系统属性，并将所有的系统属性保存到文件中
//        Properties props = System.getProperties();
//        props.store(new FileOutputStream("props.txt"), "System Properties");

        // 获取指定的系统属性
        String osName = System.getProperty("os.name");
        System.out.println(osName);

        System.out.println("------");

        // System.identityHashCode方法
        SystemTest systemTest = new SystemTest();
        systemTest.testIdentityHashCodeTest();
    }

    /**
     * identityHashCode(obj):该方法返回指定对象的精确的hashCode值，也就是根据对象的地址计算得到的hashCode值
     * 当某个类的hashCode方法被重写后，该类实例的hashCode方法就不能唯一的表示该对象了，但通过identityHashCode
     * 返回的hashCode值依然是根据对象的地址计算得到的hashCode值，也就是说，如果两个对象的identityHashCode值
     * 相同，则两个对象绝对是同一个对象
     *
     */
    public void testIdentityHashCodeTest(){
        String str1 = new String("hello");
        String str2 = new String("hello");

        /*
            String类重写了hashCode()方法--根据字符序列计算hashCode值
            因为str1和str2的字符序列相同，所以它们的hashCode值相同
         */
        System.out.println(str1.hashCode());//99162322
        System.out.println(str2.hashCode());//99162322

        /*
           而，它们又是不同的对象，所以它们的identityHashCode值不同
         */
        System.out.println(System.identityHashCode(str1));//356573597
        System.out.println(System.identityHashCode(str2));//1735600054

        /*
            同一个对象，identityHashCode值相同
         */
        String str3 = "Java";
        String str4 = "Java";
        System.out.println(System.identityHashCode(str3) + "----" + System.identityHashCode(str4));//21685669----21685669

    }
}
