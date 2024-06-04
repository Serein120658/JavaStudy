package day05.exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerDemo3 {
    public static void main(String[] args) {
        /*
        3. MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置
         */
        // 结合前面的内容，分支结构，使用三种方法找出最大值
        // 声明数组，并使用random随机赋值0-100内的数
        Scanner sc = new Scanner(System.in);
        Random Random = new Random();
        System.out.println("请输入数组长度：");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Random.nextInt(100);
        }
        System.out.println("原始数组为：" + Arrays.toString(arr));
        // 由于小T提示里面写了冒泡和选择排序，故在此再熟悉一下
        System.out.print("1.使用基本算法找最大值" + "\n" +
        "2.使用冒泡排序找最大值" + "\n" +
        "3.使用选择排序找最大值" + "\n");
        System.out.print("请输入你的选择：");
        int select = sc.nextInt();
        int max;
        switch (select){
            case 1:
                max = commonFunction(arr);
                System.out.println("最大值为:" + max);
                // 扩容
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = max;
                System.out.println("扩容后的数组为：" + Arrays.toString(arr));
                break;
            case 2:
                max = bubbleSortFunction(arr);
                System.out.println("最大值为:" + max);
                // 扩容
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = max;
                System.out.println("扩容后的数组为：" + Arrays.toString(arr));
                break;
            case 3:
                max = selectionSortFunction(arr);
                System.out.println("最大值为:" + max);
                // 扩容
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = max;
                System.out.println("扩容后的数组为：" + Arrays.toString(arr));
                break;
            default:
                System.out.println("输入错误");
        }
    }
    public static int commonFunction(int[] arr){
        // 假设第一个为最大值
        int max = arr[0];
        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // System.out.println("最大值为：" + max);
        return max;
    }
    // 冒泡排序
    public static int bubbleSortFunction(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j =0 ;j<arr.length-i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后的数组为：" + Arrays.toString(arr));
        return arr[arr.length-1];
    }
    // 选择排序
    public static int selectionSortFunction(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            // 找最小
            int minI = i;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[j] < arr[minI]){
                    minI = j;
                }
            }
            if(minI != i){
                int temp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = temp;
            }
        }
        System.out.println("选择排序后的数组为：" + Arrays.toString(arr));
        return arr[arr.length-1];
    }
}
