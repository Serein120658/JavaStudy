package day04.exercise;

import java.util.Scanner;

public class ExerDemo2 {
    public static void main(String[] args) {
        /*
        2.	Guessing猜数字之while版：
            要求：随机生成一个数，由用户来猜，猜不对则反复猜，
            并给出大小提示，猜对的则结束，用while来实现。
        * */
        // 生成随机数100以内的随机数，后续会接入random生成随机数
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 100);
        while (true) {
            System.out.println("请输入一个数字：");
            int input = scanner.nextInt();
            if (input > num) {
                System.out.println("猜大了");
            } else if (input < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
