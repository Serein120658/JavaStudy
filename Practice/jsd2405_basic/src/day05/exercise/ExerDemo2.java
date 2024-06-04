package day05.exercise;

import java.util.Arrays;
import java.util.Random;

public class ExerDemo2 {
    public static void main(String[] args) {
        /*
        2. 数组小代码练习：声明、初始化、访问、遍历、复制
         */
        Random random = new Random();
        // 数组的声明
        int[] arr = new int[5];

        // 数组的初始化
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        // 数组的访问,对arr进行赋值，使用random进行随机数赋值
        for(int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        // 数组的访问
        System.out.println(arr[0]);
        // 如果访问数组中的元素，数组下标越界，会抛出ArrayIndexOutOfBoundsException异常

        // 数组的遍历
        // 如果我们想打印数组，但是不想写循环，可以使用Arrays.toString(arr)方法
        // 例如：打印arr1
        System.out.println(Arrays.toString(arr1));

        // 使用循环去打印数组arr2
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        // 数组的复制
        // 1.使用循环复制arr数组的元素
        int[] arr3 = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr3[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr3));

        // 2.使用arraycopy()方法复制arr1数组的元素
        int[] arr4 = new int[arr1.length];
        // 参数1：源数组，参数2：源数组的起始位置，参数3：目标数组，参数4：目标数组的起始位置，参数5：复制的长度
        // 注意别越界：源数组的起始位置+复制的长度不能大于源数组的长度，目标数组的起始位置+复制的长度不能大于目标数组的长度
        System.arraycopy(arr1,0,arr4,0,arr1.length);

        // 3.使用Arrays.copyOf()方法复制arr3数组的元素
        // 参数1：源数组，参数2：复制的长度, 长度可以小于源数组的长度(切片复制)，长度也可以大于源数组的长度(扩容)
        int[] arr5;
        arr5 = Arrays.copyOf(arr3,arr3.length-2);
        System.out.println(Arrays.toString(arr5));
        arr5 = Arrays.copyOf(arr3,arr3.length);
        System.out.println(Arrays.toString(arr5));
        arr5 = Arrays.copyOf(arr3,arr3.length+5);
        System.out.println(Arrays.toString(arr5));

        // 扩容情况下，将前面生成的随机数组赋值给arr5
        System.arraycopy(arr,0,arr5,5,arr.length-1);
        System.out.println(Arrays.toString(arr5));

    }
}
