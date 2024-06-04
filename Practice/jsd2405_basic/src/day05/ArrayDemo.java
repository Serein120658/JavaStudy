package day05;

/**
 * 什么是数组？
 * 数组是一种引用类型，数组中存放的是同一种数据类型的元素
 *
 */

public class ArrayDemo {
    public static void main(String[] args) {
        // 数组的定义
        // 声明了整型数组a，包含5个元素，每个元素都是int类型，默认值为0
        int [] a = new int[5];
        // 声明了浮点型数组b,包含了10个元素，每个元素都是double类型，默认值为0.0
        double [] b = new double[10];
        // 声明了布尔型数组c，包含了20个元素，每个元素都是boolean类型，默认值为false
        boolean [] c = new boolean[20];
        // 声明了字符型数组h，包含3个元素，每个元素都是char类型，默认值为0
        char[] h = new char[3];
        for (char value : h) {
            System.out.println(value);
//            System.out.println((char) 0);
        }
        // 数组初始化,初始化数组当中的元素
        int[] d = new int[3]; // 0,0,0
        int[] e = {1,2,3}; // 1,2,3
        int[] f = new int[]{1,2,3}; // 1,2,3
        int[] g;
        //  g = {1,2,3,};  // 编译错误，此方式只能声明，同时初始化
        g = new int[]{1,2,3};

        // 数组的访问：访问数组当中的元素
        int[] arr = new int[3];
        System.out.println("数组的长度："+ arr.length);
        System.out.println("数组的第一个元素是：" + arr[0]);
        arr[0] = 100;  // 给第一个元素赋值为100
        arr[1] = 200;  // 给第二个元素赋值为200
        arr[2] = 300;  // 给第三个元素赋值为300
        // arr[3] = 400; // 错误，数组越界
        System.out.println(arr[2]);  // 输出第三个元素的值
        System.out.println(arr[arr.length - 1]); // 输出数组最后一个元素的值

        // 遍历(迭代)数组：从头到尾挨个走一遍
        int[] arr1 = new int[10];
        for(int i = 0;i<arr1.length;i++){  // 遍历arr1数组
            arr1[i] = (int) (Math.random()*100);  // 随机生成0-99的整数
            System.out.println(arr1[i]);
        }

    }
}
