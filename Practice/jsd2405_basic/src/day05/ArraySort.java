package day05;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        // 数组排序
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        // 原始数据
        System.out.println("原始数据：" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后：" + Arrays.toString(a));

        // 使用random生成随机数
        Random random = new Random();
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(100);
        }
        System.out.println("使用random生成的原始数据：" + Arrays.toString(b));
        Arrays.sort(b);
        System.out.print("排序后：" + Arrays.toString(b));
    }
}
