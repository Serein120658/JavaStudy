package day06;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);
        int input;
        while (true) {

            System.out.println("请输入一个数字");
            input = sc.nextInt();
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
