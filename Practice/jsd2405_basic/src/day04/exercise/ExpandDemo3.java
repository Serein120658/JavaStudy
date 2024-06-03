package day04.exercise;

public class ExpandDemo3 {
    public static void main(String[] args) {
        /* 4. 输出1900到2023年之间所有的闰年(每够10个年份，换一行)*/
        // 统计是否有10个了，有那就清0，然后换行
        int count = 0;
        for(int i = 1900; i < 2023;i++){
            // 判断i是否是闰年
            if(i%4 == 0 && i % 100 != 0 || i % 400 == 0){
                System.out.print(i + " ");
                count++;
                if(count % 10 == 0){
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}
