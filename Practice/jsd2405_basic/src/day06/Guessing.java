package day06;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数字");
            int num1 = scanner.nextInt();
            if (num1 > num) {
                System.out.println("猜大了");
            } else if (num1 < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
