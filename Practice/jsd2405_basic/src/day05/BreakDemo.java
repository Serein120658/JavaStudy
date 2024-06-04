package day05;

/**
 * break语句
 * 在某种特定情况下，提前结束循环
 */

public class BreakDemo {
    public static void main(String[] args) {
        // 示例
        for(int num = 1; num <= 9; num ++){
            if(num == 4){  // 在某种特定情况下，提前结束循环
                break; // 跳出循环
            }
            System.out.println(num + "*9=" + num * 9 );
        }
    }
}
