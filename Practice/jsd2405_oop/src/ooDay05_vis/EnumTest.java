package ooDay05_vis;

public class EnumTest {
    public static void main(String[] args) {
        Seasons[] s = Seasons.values();
        for(int i =0 ;i<s.length;i++){
            System.out.println(s[i]);
        }


        Seasons s1 = s[0];
        s1.setDesc("春江水暖鸭先知");
        s1.setName("春");
        switch(s1){
            case SPRING:
                System.out.println(s1.getName() +" " + s1.getDesc());
                break;
            case SUMMER:
                System.out.println(s1.getName() + " " + s1.getDesc());
                break;
            case AUTUMN:
                System.out.println(s1.getName() + " " + s1.getDesc());
                break;
            case WINTER:
                System.out.println(s1.getName() + " " + s1.getDesc());
                break;
        }
        System.out.println();
        for(Seasons s2 : Seasons.values()){
            System.out.println(s2.getName() + " " + s2.getDesc());
        }
    }
}
