package day04.exercise;

public class ConstrueDemo {
    public static void main(String[] args) {
        // 求出1-100所有偶数的和
        int sum = 0,sum1=0;
        for(int i = 1; i <= 100; i++){
            if(i%2 == 0){
                // System.out.print(i + "  ");
                sum +=i;
            }else{
                sum1 += i;
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
