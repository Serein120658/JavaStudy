package ooDay02;

public class Chick extends Animal{
    // 没有特殊属性
    // 无参构造
    Chick(){}

    // 有参构造
    Chick(String name, int age, String color){
        super(name, age ,color);
    }

    // layEggs
    void layEggs(){
        System.out.println(color + "颜色的" + age + "岁的小鸡" + name + "正在下蛋");
    }
    //重写eat

    @Override
    void drink() {
         System.out.println(color + "颜色的" + age + "岁的" + name + "正在喝水");
    }
}
