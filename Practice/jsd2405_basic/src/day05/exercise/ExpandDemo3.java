package day05.exercise;

public class ExpandDemo3 {
    public static void main(String[] args) {
        /*
        3. 利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：
           *
           ***
           *****
           *******
           *********
           ***********
         */
        int row = 6;
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= 2*i -1; j++){ // 观察发现，每行输出的*个数是2*i-1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
