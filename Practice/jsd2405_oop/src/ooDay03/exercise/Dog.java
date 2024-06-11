package ooDay03.exercise;

public class Dog extends Animal implements Swim{
    // 构造
    Dog(){}
    Dog(String name, int age,String color){
        super(name,age,color);
    }

    // 重写父类当中的抽象方法
    void eat(){
        System.out.println(color + "颜色的" + age + "岁的" + name  + "正在吃骨头");

    }

    // 重写接口Swim当中的swim方法，记得一定要使用public
    public void swim(){
        System.out.print(color + "颜色的" + age + "岁的" + name + "正在游泳");
    }

    // 普通方法
    void lookHome(){
        System.out.println(color + "颜色的" + age + "岁的" + name + "正在看家");
    }
}
