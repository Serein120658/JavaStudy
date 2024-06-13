package ooDay05;

/**
 * 简化版枚举测试类
 */
public class EnumTest {
    public static void main(String[] args) {
        Seasons[] s = Seasons.values();
        for(int i = 0;i<s.length;i++){
            System.out.println(s[i]);
        }

        // 枚举类型天生适合switch语句
        Seasons s1 = s[0];

        switch(s1){
            case SPRING:
                System.out.println("春天到了...");
                break;
            case SUMMER:
                System.out.println("夏天到了...");
                break;
            case AUTUMN:
                System.out.println("秋天到了...");
                break;
            case WINTER:
                System.out.println("冬天到了...");
                break;
            }
    }
}
