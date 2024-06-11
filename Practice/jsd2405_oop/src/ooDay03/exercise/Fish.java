package ooDay03.exercise;

public class Fish extends Animal implements Swim{
    // 重写父类当中的抽象方法
    void eat(){
        System.out.println(color + "颜色的" + age + "岁的" + name + "正在吃虾米");
    }

    // 重写接口当中的抽象方法
    public void swim(){
        System.out.println(color + "颜色的" + age + "岁的" + name + "正在游泳");
    }
}
