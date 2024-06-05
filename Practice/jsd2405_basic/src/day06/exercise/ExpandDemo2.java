package day06.exercise;

import day06.MethodDemo;
import java.util.Arrays;

public class ExpandDemo2 {
    public static void main(String[] args) {
        /*
        2. 定义一个printArrayData()，用于输出整型数组的每一个元素的值，测试方法
         */
        // 生成随机整型数组,使用不同包里面编写好的方法
        int[] arr = MethodDemo.getArray(10,0,100);
        System.out.println("原数组为:"+ Arrays.toString(arr));
        printArrayData(arr);
    }

    public static void printArrayData(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println("第" + (i+1) + "个元素是：" +arr[i]);
        }
    }
}
