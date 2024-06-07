package ooDay02;

public class Doctor extends Person {
    String title;

    // 无参构造
    Doctor(){

    }

    // 有参构造
    Doctor(String name, int age, String address, String title){
//        this.name = name;
//        this.age = age;
//        this.address = address;
        super(name, age, address);  // 使用super调用父类有参构造方法
        this.title = title;
    }
    void cut(){
        System.out.println(name + "医生在做手术");
    }
}
