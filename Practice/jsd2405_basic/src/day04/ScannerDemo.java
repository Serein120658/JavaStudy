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
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        System.out.println("你输入的字符串是：" + str);
        System.out.println("请输入一个浮点数：");
        double num2 = scanner.nextDouble();
        System.out.println("你输入的浮点数是：" + num2);
        System.out.println("请输入一个布尔值：");
        boolean bool = scanner.nextBoolean();
        System.out.println("你输入的布尔值是：" + bool);
        System.out.println("请输入一个字符：");
        char ch = scanner.next().charAt(0);
        System.out.println("你输入的字符是：" + ch);
        scanner.close();

        /**
         * next()和 nextLine()的区别
         * next()：只读取一个单词，遇到空格就停止
         * 当你输入一串字符: i love java
         * 那么输出的时候只有i
         * nextLine()：读取一行，遇到回车就停止
         * 当你输入一串字符: i love java
         * 按回车
         * 那么输出的时候就是i love java
         */
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str2 = scanner2.nextLine();
        System.out.println("你输入的字符串是：" + str2);
        System.out.println("请输入一个字符串：");
        String str3 = scanner2.next();
        System.out.println("你输入的字符串是：" + str3);
        scanner2.close();


    }
}
