package day05;

import java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        // 遍历数组
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100); // 随机生成0-99的整数
            System.out.print(arr[i]+" ");
        }
        // 声明新的数组，数组的元素拷贝到新的数组中，使用java中自带的拷贝方法
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        // 原始数组
        System.out.println("\n原始数组："+Arrays.toString(arr));
        System.out.println("拷贝后的数组："+Arrays.toString(arr2));

        // 找出数组中的最大值
        // 思路: 从第一个元素开始，依次和后面的元素比较，如果比后面的元素大，则交换位置
        // 循环次数: n-1
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("\n最大值为："+max);

        // 也可以使用冒泡排序，然后打印出最后的一个值
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("最大值为："+arr[arr.length-1]);

        // 使用选择排序，然后打印出最后的一个值
        for(int i =0;i<arr2.length - 1;i++){
            // 找到最小值的下标
            int min = i;
            for(int j = i+1;j<arr2.length;j++){
                if(arr2[j] < arr2[min]){
                    min = j;
                }
            }
            if(min != i){
                System.out.println("第"+i+"次交换："+arr2[i]+"和"+arr2[min]);
                int temp = arr2[i];
                arr2[i] = arr2[min];
                arr2[min] = temp;
            }

        }
        System.out.println("数组排序后为："+ Arrays.toString(arr2));
        System.out.println("最大值为："+arr2[arr2.length-1]);

    }
}
