package ooDay01.homework;

public class Student {
    /*
    - Student类：name，age，className，stuId，构造方法()，study()，sayHi()，playWith(String anotherName)
     */

    String name;
    int age;
    String className;
    String stuId;

    // 无参构造
    Student(){}

    // 有参构造
    Student(String name, int age, String className, String stuId){
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }

    // study()方法
    void study(){
        System.out.println(name + "在学习");
    }

    // sayHi()方法
    void sayHi(){
        System.out.println("大家好，我是" + name + "，今年" + age + "岁了，所在班级是" + className + "，学号是" + stuId);
    }

    // playWith()方法
    void playWith(String anotherName){
        System.out.println(name + "和" + anotherName + "一起玩");
    }

}
