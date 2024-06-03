package day04.exercise;

import java.util.Scanner;
public class ExerDemo4 {
    public static void main(String[] args) {
        /*
         *   4.	for循环：输出5次"行动是成功的阶梯"、
         *   输出9的乘法表(1到9、1/3/5/7/9、9到1)、
         *   累加1到100的和
         * */
        // 顺便添加Switch...case语句的使用
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择：");
        System.out.println("1.输出5次“行动是成功的阶梯”" + "\n" +
                "2.输出9的乘法表(1到9、1/3/5/7/9、9到1)" + "\n" +
                "3.累加1到100的和" + "\n" +
                "4.退出循环");

        int num;
        do {
            num = sc.nextInt();
            switch (num) {
                case 1:
                    forExer();
                    break;
                case 2:
                    multiplication();
                    break;
                case 3:
                    sum();
                    break;
                default:
                    System.out.println("结束！");
                    break;
            }

        } while (num != 4);
    }
    public static void forExer()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("行动是成功的阶梯");
        }
    }

    public static void multiplication() {
        System.out.println("1-9乘法口诀表：");
        for(int i = 1;i<10;i++){
            System.out.println(i+"*9" + "=" + i*9);
        }
        System.out.println("1/3/5/7/9乘法口诀表：");
        for(int i = 1;i<10;i+=2){
            System.out.println(i+"*9" + "=" + i*9);
        }
        System.out.println("9-1乘法口诀表：");
        for(int i = 9;i>0;i--){
            System.out.println(i+"*9" + "=" + i*9);
        }

    }

    public static void sum() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1-100的和为：" + sum);
    }
}
