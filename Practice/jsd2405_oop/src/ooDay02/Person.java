package ooDay02;

/**
 * 人类
 *
 */
public class Person {
    // 属性
    String name;
    int age;
    String address;
    // 无参构造
    Person(){}
    // 构造重载
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 行为
    // 吃饭
    void eat(){
        System.out.println(name + "正在吃饭");
    }

    // 睡觉
    void sleep(){
        System.out.println(name + "正在睡觉");
    }

    // 问好
    void sayHello(){
        System.out.println("大家好，我是" + name + "今年" + age + "岁了，现在住在" + address);
    }

}
