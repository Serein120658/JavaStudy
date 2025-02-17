package day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 猜数字游戏
        int temp = 50;
        // 使用math.random()生成一个随机数
        // 生成0-1000的随机数
        temp = (int)(Math.random() * 1000 + 1);
        while(true){
            System.out.print("Guess a number: ");
            int guess = sc.nextInt();
            if(guess == temp){
                System.out.println("Congratulations! You guessed correctly!");
                break;
            }else if(guess < temp){
                System.out.println("Too low!");
            }else{
                System.out.println("Too high!");
            }
        }
        // 第二种方法
        int guess = sc.nextInt();
        while(guess != temp){
            if(guess < temp){
                System.out.println("Too low!");
            }else{
                System.out.println("Too high!");
            }
            System.out.print("Guess a number: ");
            guess = sc.nextInt();
        }
        System.out.println("Congratulations! You guessed correctly!");

        // 当循环的的第一要素和第三要素相同的时候，首选do...while循环
        int guess1;
        do{
            System.out.print("Guess a number: ");
            guess1 = sc.nextInt();
            if(guess1 == temp){
                System.out.println("Congratulations! You guessed correctly!");
            }else if(guess1 < temp){
                System.out.println("Too low!");
            }else{
                System.out.println("Too high!");
            }
        }while(guess1!=temp);

    }
}
