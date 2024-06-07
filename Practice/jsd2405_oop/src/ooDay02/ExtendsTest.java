package ooDay02;

public class ExtendsTest {
    public static void main(String[] args) {

        // 父类对象测试
        Person p = new Person();
        p.name = "坤哥";
        p.age = 22;
        p.address = "朝阳";
        p.eat();
        p.sleep();
        p.sayHello();

        // 父类不能访问子类
        //  p.study();  // 报错

        // 学生类测试
        Student zs = new Student("张三", 18, "计算机科学与技术", "2019001", "北京");
        // 父类方法
        zs.eat();
        zs.sleep();
        zs.study();
        zs.sayHello();

        // 子类方法
        zs.sayHi();

        // 老师类测试
        Teacher ls = new Teacher("李四", 28, "北京", 10000);
        // 父类
        ls.eat();
        ls.sleep();
        ls.sayHello();
        // 子类方法
        ls.teach();

        // 医生类测试
        Doctor ww = new Doctor("王五", 38, "北京", "主任医师");
        ww.eat();
        ww.sleep();
        ww.sayHello();

        ww.cut();
    }
}
