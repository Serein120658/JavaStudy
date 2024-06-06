package ooDay01;

/**
 * 构造函数的演示
 */
public class ConsDemo {
    public static void main(String[] args) {
        // 无参构造
        Student lb = new Student();
        lb.name = "李白";
        lb.age = 18;
        lb.className = "1班";
        lb.stuId = "001";
        lb.study();
        lb.sayHi();
        lb.playWith("杜甫");

        // 有参构造
        Student zh = new Student("杜甫", 20, "1班", "002");
        zh.study();
        zh.sayHi();
        zh.playWith("李赏樱");
    }
}
