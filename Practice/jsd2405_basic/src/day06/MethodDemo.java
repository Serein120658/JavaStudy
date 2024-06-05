package day06;

import java.util.Arrays;
import java.util.Random;

/**
 * 方法的练习
 */
public class MethodDemo {
    public static void main(String[] args) {
        // 无参，无返回值方法调用
        sayHello();

        // 有参，无返回值方法调用
        makeFriends("小明");
        makeFriends("小光");

        // 有参，有返回值方法调用
        System.out.println(makeMarriage("阿尔特曼","维丽娜"));

        // 有参，有返回值方法调用，返回值为数组
        String[] arr = makeArray("小李",20,'男',3);
        System.out.println(Arrays.toString(arr));


        // 随机生成一个数组，并返回
        int[] array = new int[5];
        array = getArray(5,100,200);
        System.out.println("随机生成的数组为:" + Arrays.toString(array));


    }

    // 说好
    public static void sayHello()
    {
        System.out.println("Hello World!");
    }

    // 交朋友
    public static void makeFriends(String name) {
        if(name.equals("小光")){
            return;
        }
        System.out.println("我想和"+name+"交朋友");
    }

    // 求婚
    public static String makeMarriage(String male,String female) {
        return (male + "正在向" + female + "求婚");
    }
    // 返回值为String数组
    public static String[] makeArray(String a,int b,char c,int length) {
        String[] str = new String[length];
        // 使用循环去为数组补充内容
        for (int i = 0; i < length; i++) {
            str[i] = "我叫" + a + "，今年" + b +"岁了" +"性别:" + c;
        }

        return str;
    }

    // 生成一个整型数组，并随机填充数据，范围自定义
    public static int[] getArray(int length,int min,int max) {
        Random Random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Random.nextInt(max - min + 1) + min;
        }
        return arr;
    }

}
