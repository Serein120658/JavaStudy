package ooDay04.homework;

public class Chick extends Animal{
    // 无参构造
    Chick(){}

    // 有参构造
    Chick(String name,int age, String color){
        super(name,age,color);
    }

    // 重写父类当中的抽象方法
    void eat(){
        System.out.println(color + "颜色的" + age + "岁的小鸡" + name + "正在吃小米");
    }

    // Chick类中的普通方法
    void layEggs(){
        System.out.println(color + "颜色的" + age + "岁的小鸡" + name + "正在下蛋");
    }
}
