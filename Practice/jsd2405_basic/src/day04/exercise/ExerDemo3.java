package day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class ExerDemo3 {
    public static void main(String[] args) {
        /*3.	Guessing猜数字之do...while版
            要求：随机生成一个数，由用户来猜，猜不对则反复猜，
            并给出大小提示，猜对的则结束，用do...while来实现。
            由于之前已经上过部分课程，所以这里使用random生成随机数
        * */
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int temp = random.nextInt(100);
        int guess;
        do{
            System.out.println("开始猜吧！");
            guess = sc.nextInt();
            if(guess>temp){
                System.out.println("猜大了！");
            }else if(guess<temp){  // 切记不能使用else
                System.out.println("猜小了！");
            }
        }while(guess != temp);
        System.out.println("恭喜你猜对了！");
    }
}
