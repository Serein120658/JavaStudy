package day06.exercise;

import java.util.Random;
import java.util.Scanner;

public class ExerDemo3 {
    public static void main(String[] args) {
        /*
        3. 综合练习二：
           - 完成猜数字小游戏
           - 要求：使用while(true)自造死循环实现
         */
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // 生成随机数
        int num = random.nextInt(100) + 1;
        System.out.println(num);

        // 存储猜的数
        int guessNum;
        while(true){
            System.out.println("猜吧！");
            guessNum = sc.nextInt();
            if(guessNum > num){
                System.out.println("猜大了");
            }else if(guessNum<num){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
