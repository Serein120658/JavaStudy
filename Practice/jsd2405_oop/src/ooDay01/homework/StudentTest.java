package ooDay01.homework;

public class StudentTest {
    public static void main(String[] args) {
        /*
        - StudentTest类：创建对象，访问测试
         */
        // 调用无参构造 创建对象
        Student lb = new Student();
        lb.name = "李白";
        lb.age = 22;
        lb.className = "jsd2405";
        lb.stuId = "1001";
        lb.study();
        lb.sayHi();
        lb.playWith("杜甫");

        // 调用有参构造 创建对象
        Student ls = new Student("Jobs", 20, "jsd2405", "1002");
        ls.study();
        ls.sayHi();
        ls.playWith("Serein");
    }
}
