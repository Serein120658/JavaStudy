package day04.exercise;
import java.util.Scanner;

public class ExpandDemo1 {
    public static void main(String[] args) {
        /*
        1. 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("+");
        } else if (num < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }
}
