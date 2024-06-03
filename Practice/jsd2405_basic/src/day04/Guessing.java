package day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        // 猜数字游戏
        int temp = 100;
        while(true){
            System.out.print("Guess a number between 1 and 100: ");
            Scanner sc = new Scanner(System.in);
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
    }
}
