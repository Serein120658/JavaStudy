package day04;

import java.util.Scanner;

public class CycleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * while循环 先判断后执行，有可能一次都不执行
         * 案例1: 循环打印n次   行动是成功的阶梯
         * do...while循环 先执行后判断，循环至少执行一次
         */
        // 初始化循环次数
        int times = 0;
        while(times < 5){
            System.out.print("行动是成功的阶梯"+"\n"); // 相当于println
            times ++;
        }
        /*
        *   执行过程---带数
        *                  times 0
        *   true -> 打印 -> times 1
        *   true -> 打印 -> times 2
        *   true -> 打印 -> times 3
        *   true -> 打印 -> times 4
        *   true -> 打印 -> times 5
        *   false -> 跳出循环
        * */

        // for打印乘法口诀表
        for(int i = 1;i < 10;i++){
            for(int j= 1;j<=i;j++){
                /**
                 * 转义字符
                 * \t 制表符
                 * \n 换行符
                 */
                System.out.print(j +"*"+ i + "=" + i*j + "\t");
            }
            System.out.println();
        }

        // 结合switch分支结构，使用三种方法去打印乘法口诀表
        while(true){
            System.out.println("请选择打印乘法口诀表的方法：1.while循环，2.do...while循环，3.for循环,4.退出");
            int select = sc.nextInt();
            if(select == 4){
                break;
            }else{
                switch(select){
                    case 1:
                        whileMultiplication();
                        break;
                    case 2:
                        doWhileMultiplication();
                        break;
                    case 3:
                        forMultiplication();
                        break;
                    default:
                        System.out.println("输入有误，请重新输入");
                }
            }
        }

    }
    public static void whileMultiplication(){
        // 初始化循环变量
        int i = 1;
        while(i<=9){
            int j = 1;
            while(j<=i){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void doWhileMultiplication(){
        int i = 1;
        do{
            int j = 1;
            do{
                System.out.print(j + "*" + i + "=" + i*j + "\t");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while(i<=9);
    }
    public static void forMultiplication(){
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
