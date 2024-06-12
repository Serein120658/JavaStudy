package ooDay04.homework;

public class Dog extends Animal implements Swim{
    // 无参构造
    Dog(){}
    // 有参构造
    Dog(String name, int age , String color){
        super(name,age,color);
    }

    // 重写父类当中的抽象方法
    void eat(){
        System.out.println(color + "颜色的" + age + "岁的狗狗" + name + "正在吃骨头");
    }

    // 重写接口当中的抽象方法，记住一定要加public
    public void swim(){
        System.out.println(color + "颜色的" + age + "岁的狗狗" + name + "正在游泳");
    }

    // 狗狗类中的普通方法
    void lookHome(){
        System.out.println(color + "颜色的" + age + "岁的狗狗" + name + "正在看家");
    }

}
