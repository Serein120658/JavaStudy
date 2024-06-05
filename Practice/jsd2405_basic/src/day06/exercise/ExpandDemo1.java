package day06.exercise;

import java.util.Arrays;
import java.util.Random;

public class ExpandDemo1 {
    public static void main(String[] args) {
        /*
        1. 定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法
         */
        Random random = new Random();
        int num = 10;
        int[] arr = new int[num];
        for(int i = 0; i<arr.length;i++){
            arr[i] =  random.nextInt(100);
        }
        System.out.println("原数组为:" + Arrays.toString(arr));
        System.out.println("数组中的最大值为:" + getMaxOfArray(arr));
    }
    public static int getMaxOfArray(int[] arr) {
        // 使用系统自带的排序方法寻找最大值
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
