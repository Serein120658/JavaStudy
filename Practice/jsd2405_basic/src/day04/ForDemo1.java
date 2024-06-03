package day04;

public class ForDemo1 {
    public static void main(String[] args) {
        // 练习1: 输出1-100的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        /*
        * 模拟执行过程
        * i = 1, sum = 1
        * i = 2, sum = 1+2
        * i = 3, sum = 1+2+3
        *   ······
        * i = 100, sum = 5050
        * */
    }
}
