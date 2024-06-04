package day05.exercise;

public class ExpandDemo2 {
    public static void main(String[] args) {
        /*
        2. 利用for循环计算：求8的阶乘，并输出
         */
        int num = 8;
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
