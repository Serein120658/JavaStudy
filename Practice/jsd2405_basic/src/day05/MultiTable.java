package day05;

public class MultiTable {
    public static void main(String[] args) {
        // 打印乘法口诀表
        int col = 9; // 表格列数
        for(int i = 1;i<=col;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t\t\t");
            }
            System.out.println("\n"); // 实现换行
        }
    }
}
