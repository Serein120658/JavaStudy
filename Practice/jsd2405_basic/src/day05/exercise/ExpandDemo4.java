package day05.exercise;

import java.util.Arrays;
import java.util.Random;

public class ExpandDemo4 {
    public static void main(String[] args) {
        /*
        4. 定义数组，包含10个元素，随机生成数据(范围自拟)，查找最大值和最小值，并输出
         */
        Random Random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Random.nextInt(1000);
        }
        // 原始数据为
        System.out.println("原始数据为：" + Arrays.toString(arr));
        // 使用选择排序
        for(int i = 0;i<arr.length-1;i++){
            // 找最小
            int minI = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minI]){
                    minI = j;
                }
            }
            if(minI!=i){
                int temp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = temp;
            }
        }
        System.out.println("最大值："+arr[arr.length-1]);
        System.out.println("最小值："+arr[0]);

        // 复制数组
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        // 使用系统自带的排序方法去找最大值和最小值
        Arrays.sort(arr1);
        System.out.println("最大值："+arr1[arr1.length-1]);
        System.out.println("最小值："+arr1[0]);
    }
}
