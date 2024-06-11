package ooDay03.exercise;

public class Chick extends  Animal{
    // 重写eat方法
    void eat(){
        System.out.println(color + "颜色的" + age + "岁的" + name + "正在吃小米");
    }

    // 普通方法
    void layEggs(){
        System.out.println(color + "颜色的" + age + "岁的" + name + "正在放 laid eggs");
    }
}
