package day05;

import java.util.Arrays;

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
        System.out.print("排序后：" + Arrays.toString(a));
    }
}
