package day05.exercise;

public class ExpandDemo1 {
    public static void main(String[] args) {
        /*
        1. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出
         */
        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
