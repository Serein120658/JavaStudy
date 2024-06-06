package ooDay01;

public class Student {
    String name;
    int age;
    String className;
    String stuId;

    // 学习
    void study(){
        System.out.println(name + "正在学习");
    }

    // 问好
    void sayHi(){
        System.out.println("大家好！我叫" + name + "今年" + age + "岁了,所在班级为" + className + "我的学号是" + stuId );
    }

    // 和别人一起玩
    void playWith(String anotherName){
        System.out.println(name + "和" + anotherName + "一起玩");
    }
}
