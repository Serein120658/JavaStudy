package ooDay03.exercise;

/**
 *
 1. Animal、Swim、Dog、Chick、Fish：---------------------------2遍

 - Animal类：name、age、color、Animal(参)、drink()、abstract eat()
 - Swim接口：swim()
 - Dog类：继承Animal、实现Swim接口，重写eat()、lookHome()、重写swim()
 - Chick类：继承Animal，重写eat()、layEggs()
 - Fish类：继承Animal、实现Swim接口，重写eat()、重写swim()
 */
public abstract class Animal {
    String name;
    int age;
    String color;
    // 无参
    Animal(){}

    // 有参构造
    Animal(String name,int age , String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 普通方法
    void drink(){
        System.out.println(color + "颜色的" + age + "岁的" + name + " 正在喝水");
    }

    // 抽象方法
    abstract void eat();
}
