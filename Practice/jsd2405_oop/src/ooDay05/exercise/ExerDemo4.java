package ooDay05.exercise;

/**
 * 4. 完成Seasons和EnumTest，演示枚举的用法
 */
public class ExerDemo4 {
    public static void main(String[] args) {
        // 枚举
        Seasons[] seasons = Seasons.values();
        for(int i = 0;i<seasons.length;i++){
            System.out.println(seasons[i]);
        }

        // 天生的switch
        Seasons s = seasons[0];
        switch (s){
            case SPRING:
                s.show();
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
            }
    }
}
