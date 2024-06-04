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

        // arraycopy(源数组，源数组的起始位置，目标数组，目标数组的起始位置，拷贝的个数)
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
                // System.out.println("第"+i+"次交换："+arr2[i]+"和"+arr2[min]);
                int temp = arr2[i];
                arr2[i] = arr2[min];
                arr2[min] = temp;
            }

        }
        System.out.println("数组排序后为："+ Arrays.toString(arr2));
        System.out.println("最大值为："+arr2[arr2.length-1]);

        // 数组的复制
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];
        // 使用系统自带的的arraycopy方法
        // arraycopy(源数组，源数组的起始位置，目标数组，目标数组的起始位置，拷贝的个数)
        // 需要注意的是，如果目标数组的长度小于源数组的长度，则数组会截取前几个元素
        // 如果目标数组的长度大于源数组的长度，则数组会自动补全
        // System.arraycopy(a, 3, b, 1, a.length); // 越界，从a数组的第4个元素开始，到b数组的第2个元素，一共复制5个元素
        // System.arraycopy(a, 1, b, 3, a.length); // 也会出现越界问题
        System.arraycopy(a, 0, b, 0, a.length);  // 如果要复制的元素的个数超出复制到的那个数组的长度也会报错


        // 使用系统自带的copyOf方法
        // copyOf(源数组，拷贝的个数)，实现数组的复制
        // 如果拷贝的个数大于原数组的长度，则数组会自动补全
        // 如果拷贝到个数小于原数组的长度，则数组会截取前几个元素
        // 好处是：可以扩容
        int[] c = Arrays.copyOf(a, a.length);
        c = Arrays.copyOf(c, c.length+1);
        // 扩容之后
        System.out.println(Arrays.toString(c));
        c[c.length-1] = arr2[arr2.length - 1];
        // 将最大值赋值给最后一个元素
        System.out.println(Arrays.toString(c));


    }
}
