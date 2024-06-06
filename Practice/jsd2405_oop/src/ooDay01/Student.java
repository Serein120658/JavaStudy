package ooDay01;

public class Student {
    String name;
    int age;
    String className;
    String stuId;

    // 默认无参构造方法，当重载了无参构造之后，便不再默认提供
    Student(){
    }

    // 带参数的构造方法
    Student(String name, int age, String className, String stuId){
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }

    // 学习
    void study(){
        System.out.println(this.name + "正在学习");
    }

    // 问好
    void sayHi(){
        System.out.println("大家好！我叫" + this.name + "今年" + this.age + "岁了,所在班级为" + this.className + "我的学号是" + stuId );
    }

    // 和别人一起玩
    void playWith(String anotherName){
        System.out.println(this.name + "和" + anotherName + "一起玩");
    }
}
