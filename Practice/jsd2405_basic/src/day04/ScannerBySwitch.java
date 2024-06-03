package day04;
/**
 * Switch...case结构：常常用于实现多条路
 * 优点:效率高，结构清晰
 * 缺点:只能判断相等的情况
 * 应用场景:若业务只是判断整数相等，那么就可以使用switch...case结构
 */

import java.util.Scanner;

public class ScannerBySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个命令：");
            String str = sc.next();
            if(str.equals("exit")){
                System.out.println("退出程序");
                break;
            }else{
                switch (str) {
                    case "commond":{
                        System.out.println("请输入一个整数：");
                        int num = sc.nextInt();
                        System.out.println("输入的整数是：" + commond(num));
                        break;
                    }
                    case "double":{
                        System.out.println("请输入一个浮点数：");
                        break;
                    }
                    default:
                        System.out.println("输入的内容是：" + str);
                }

            }

        }
    }
    public static int commond(int num){
        return num;
    }

}
