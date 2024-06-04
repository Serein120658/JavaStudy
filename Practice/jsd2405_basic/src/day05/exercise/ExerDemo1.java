package day05.exercise;

public class ExerDemo1 {
    public static void main(String[] args) {
        /*
        1. MultiTable九九乘法表
        要求：输出九九乘法表
         */
        // 打印的列数
        int col = 9;
        for(int i = 1;i<=col;i++){
            for(int j = 1;j<=i;j++){
                // \t 制表符  占八位
                // \n 换行
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println(); // 内层循环结束后，记得换行
        }
    }
}
