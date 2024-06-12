package ooDay04.homework;

public class Fish extends Animal implements Swim{
    Fish(){}

    Fish(String name,int age, String color){
        super(name,age,color);
    }

    void eat(){
        System.out.println(color + "颜色的" + age + "岁的小鱼" + name + "正在吃虾米");
    }

    //
    public void swim(){
        System.out.println(color + "颜色的" + age + "岁的小鱼" + name + "正在游泳");
    }
}
