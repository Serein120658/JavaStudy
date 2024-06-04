package day05.exercise;

import java.util.Arrays;

public class ExerDemo4 {
    public static void main(String[] args) {
        /*
        4. 对数组进行升序排列，并输出排序后的结果
         */
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("原始数据为:"+ Arrays.toString(arr));
        // 使用系统自带的排序方法
        Arrays.sort(arr);
        System.out.println("排序后的数组为:" + Arrays.toString(arr));
    }
}
