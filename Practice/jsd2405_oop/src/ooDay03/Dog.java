package ooDay03;

public class Dog extends Animal implements Swim {
    // 设计当中没有添加属性

    Dog(){}

    // 有参
    Dog(String name, int age, String color){
        super(name,age,color);
    }

    // lookHome
    void lookHome(){
        System.out.println(color + "颜色的" + age +"岁的狗狗" + name + "正在看家");
    }

    // eat重写
    @Override
    void eat(){
        System.out.println(color + "颜色的" + age +"岁的狗狗" + name + "正在吃骨头");
    }

    // 实现接口当中的方法,重写接口当中的方法
    @Override
    public void swim() {
        System.out.println(color + "颜色的" + age +"岁的狗狗" + name + "正在游泳，最大速度为:" + MAX_SPEED);
    }

}
