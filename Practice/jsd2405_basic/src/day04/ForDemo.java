package day04;

public class ForDemo {
    public static void main(String[] args) {
        // for的练习
        // 案例1 : 打印五遍“行动时成功的阶梯”
        for (int i = 0; i < 5; i++) {
            System.out.println("行动时成功的阶梯");
        }
        /*
        * 案例1的执行过程
        * i = 0, 0 < 5, 打印“行动时成功的阶梯”
        * i = 1, 1 < 5, 打印“行动时成功的阶梯”
        * i = 2, 2 < 5, 打印“行动时成功的阶梯”
        * i = 3, 3 < 5, 打印“行动时成功的阶梯”
        * i = 4, 4 < 5, 打印“行动时成功的阶梯”
        * */

        // 案例2 : 打印1的乘法口诀表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
        // 案例3: 打印1,3,5,7,9的乘法口诀表
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();

        }
    }
}
