package day04.exercise;

import java.util.Scanner;

public class ExerDemo1 {
    public static void main(String[] args) {
        /*
        * 1.	CommandBySwitch命令解析程序：
                要求：接收用户输入的命令，依据命令做不同的操作
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的选择:1.登录，2.注册");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("登录");
                break;
            case 2:
                System.out.println("注册");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
