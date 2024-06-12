package ooDay04.homework;

/**
 * 1. Animal、Swim、Dog、Chick、Fish、Master、PolymorphicDemo类：
 *
 *    - Animal类：name、age、color、Animal(参)、drink()、eat()
 *    - Swim接口：swim()
 *    - Dog类：继承Animal、实现Swim接口，重写eat()、lookHome()、重写swim()
 *    - Chick类：继承Animal，重写eat()、layEggs()
 *    - Fish类：继承Animal、实现Swim接口，重写eat()、重写swim()
 *    - Master类：feed()喂动物
 *    - PolymorphicDemo：创建Animal数组并填充Dog/Chick/Fish对象，遍历数组：
 *      - 输出每个动物的名字，让每个动物吃饭、喝水
 *      - 若为Dog，则让它看家。若为Chick，则让它下蛋。若能游泳，则让它游泳。
 *      - 创建Master对象、Dog对象、Fish对象、Chick对象，并喂养动物
 */
public abstract class Animal {
    String name;
    int age;
    String color;
    // 无参构造
    Animal(){};
    // 有参构造
    Animal(String name ,int age ,String color)
    {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 普通方法
    void drink(){
        System.out.println(color + "颜色的" + age + "岁的" + name + "正在喝水");
    }
    // 抽象方法
    abstract void eat();
}
