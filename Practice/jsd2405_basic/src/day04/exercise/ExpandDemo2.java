package day04.exercise;

import java.util.Scanner;

public class ExpandDemo2 {
    public static void main(String[] args) {
        /*
        2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
        思路：
        先判断是否时闰年，如果是闰年，则该月的天数为29天，否则为28天
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        // 判断是否是闰年，使用布尔值去存储
        boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // 输入月份
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        // 输出月份的天数
        if(result && month == 2){  // 如果输入的是闰年且为2月份
            System.out.println("该年该月的天数为：29天");
        }else if(month == 2){ // 不是闰年为2月份
            System.out.println("该年该月的天数为：28天");
        }else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("该年该月的天数为：31天");
        }else{
            System.out.println("该年该月的天数为：30天");
        }
    }
}
