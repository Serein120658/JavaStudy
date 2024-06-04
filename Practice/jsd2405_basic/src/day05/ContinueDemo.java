package day05;

/**
 * continue
 * 跳过循环体中剩余语句而进入下一次循环
 * 但是应用率不高，很多时候换一种思路即可实现相同的效果
 */
public class ContinueDemo {
    public static void main(String[] args) {
        // 输出9的乘法口诀表，跳过能被3整除的
        for(int i = 1;i<=9;i++){
            if(i%3 == 0){
                continue;  // 跳过循环体中剩余语句而进入洗一次循环
            }
            System.out.println(i +"*9=" + i*9);
        }
        /*
           执行过程
           i = 1, false ,1*9=9
           i = 2, false ,2*9=18
           i = 3, true , continue,
           i = 4, false ,4*9=36
           i = 5, false ,5*9=45
           i = 6, false ,6*9=54
           i = 7, false ,7*9=63
           i = 8, false ,8*9=72
           i = 9, true ,continue
        *  */

        // 换一种思路实现同样的效果
        for(int num =1;num<=9;num ++){
            if(num % 3 != 0){
                System.out.println(num +"*9=" + num*9);
            }
        }

    }
}
