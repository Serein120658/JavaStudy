package ooDay02;

public class Teacher extends Person{
    // 工资
    double salary;

    // 无参
    Teacher() {}

    // 有参
    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    void teach() {
        System.out.println(name + "老师在讲授课程");
    }
    void sayHi() {
        System.out.println("我是" + name + "老师，今年" + age + "岁，工资" + salary + "元");
    }

}
