package day06.exercise;

import java.util.Arrays;
import java.util.Random;

public class ExerDemo1 {
    public static void main(String[] args) {
        /*
        1. 方法的练习：
           - 要求：
             - 定义say()无参无返回值方法，调用测试
             - 定义say()有一个参无返回值方法，调用测试
             - 定义say()有两个参无返回值的方法，调用测试
             - 定义sum()两个参有返回值方法，调用测试
             - 定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
         */
        // 调用
        say();
        say("小明");
        say("小李", 22);
        System.out.println(sum(10, 20));
        int[] arr = generateArray(10, 55, 126);
        System.out.println("生成的随机数组为:" + Arrays.toString(arr));

    }
    // 1)、无参无返回
    public static void say() {
        System.out.println("你好!");
    }

    // 2)、有一个参无返回
    public static void say(String name) {
        System.out.println("你好，我叫" + name);
    }
    // 3)、有两个参无返回
    public static void say(String name,int age) {
        System.out.println("你好，我叫" + name + "今年" + age + "岁了");
    }

    // 4)、有两个参有返回,sum方法
    public static int sum(int num1,int num2) {
        return num1 + num2;
    }

    // 5)、定义generateArray()用于生成整型数组填充随机数并返回数组
    public static int[] generateArray(int length,int min,int max) {
        Random r = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(max - min + 1) + min;
        }

        return arr;
    }
}
