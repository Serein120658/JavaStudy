package ooDay04;

public class Fish extends Animal implements Swim {
    // 无特殊属性
    Fish(){}

    Fish(String name ,int age,String color) {
        super(name,age,color);
    }

    // 重写eat方法
    @Override
    void eat() {

        System.out.println(color + "颜色的" + age + "岁的小🐟" + name + "正在吃小虾");
    }

    // 重写swim方法
    public void swim() {

        System.out.println(color + "颜色的" + age + "岁的小🐟" + name + "正在游泳，最大速度为：" + MAX_SPEED );
    }

}
