package ooDay04;

public abstract class Animal {
    // name age color
    String name;
    int age;
    String color;
    // 无参构造
    Animal(){}

    // 有参构造
    Animal(String name ,int age ,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // eat方法
    abstract void eat();

    // drink方法
    void drink(){

        System.out.println(color + "颜色的" + age + "岁的" + name + "正在喝水");
    }

}
