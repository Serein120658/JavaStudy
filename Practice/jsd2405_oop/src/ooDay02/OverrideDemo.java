package ooDay02;

public class OverrideDemo {
    public static void main(String[] args) {
        /*
        可以在方法前使用debug调试，添加断点，查看使用的方法来自哪里
         */
        // 重写方法被调用时看对象的类型执行方法(new谁就调谁)
        Student s = new Student("张三", 18, "1班", "2019001", "北京");
        s.sayHi(); // 调用的是Student类中重写后的sayHi

        Teacher t = new Teacher("李四", 28, "北京", 5000);
        t.sayHi(); // 调用的是Teacher类中重写后的sayHi

        Doctor d = new Doctor("王五", 38, "北京", "主任医师");
        d.sayHi();  // 没有重写的sayHi方法，调用的是Person类中的sayHi()方法

    }
}
