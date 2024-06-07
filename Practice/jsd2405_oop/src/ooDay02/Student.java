package ooDay02;

/**
 * extends关键字    继承
 */

public class Student  extends Person{
    // 特有属性
    String className;
    String stuId;
    // 构造函数
    Student(){}

    // 学生有参构造函数
    Student(String name, int age, String className, String stuId, String address){
        // super(name, age, address);  后续会讲,super调用父类的构造方法
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
        this.stuId = stuId;
    }

    // 特有方法
    void study(){
        System.out.println(name + "正在学习");
    }

    // void sayHi(){}
   void sayHi(){
        System.out.println("大家好，我是" + name + "，今年" + age +
                "岁了" + "，来自" + address + "，班级是" + className + "，学号是" + stuId);
   }
}
