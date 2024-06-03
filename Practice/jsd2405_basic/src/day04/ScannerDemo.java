package day04;

// scanner的演示
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /**
         * 新建了一个扫描仪，用于输入
         * 输入：
         */
        Scanner scanner =  new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println("你输入的整数是：" + num);
    }
}
