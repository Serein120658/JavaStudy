package day04;

import java.util.Scanner;

public class ScannerBySwitchTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 模拟ATM取款机
         *
         */
        System.out.println("请选择功能:1.存款，2.取款，3.查询余额，4.退卡");
        int num = sc.nextInt();
        switch (num) {
            // 一般情况下，每一个case都会对应一个功能，所以为了减少代码量，可以将每一个case的功能封装成一个方法，然后调用
            case 1:
                System.out.println("存款业务....");

                break;
            case 2:
                System.out.println("取款业务...");

                break;
            case 3:
                System.out.println("查询业务...");

                break;
            case 4:
                System.out.println("退卡业务...");

                break;
            default:
                System.out.println("别的业务");
        }
    }
}
