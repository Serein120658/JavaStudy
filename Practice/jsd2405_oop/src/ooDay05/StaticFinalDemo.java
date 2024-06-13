package ooDay05;

public class StaticFinalDemo {
    public static void main(String[] args) {
        // 常量的演示
        System.out.println(Loo.PI);
        // Loo.PI = 3.14;  // 编译错误，常量不能被改变
    }
}

class Loo{
    public static final double PI = 3.1415926;
}
