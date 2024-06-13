package ooDay05;

public class StaticFinalDemo {
    public static void main(String[] args) {
        // 常量的演示
        System.out.println(Loo.PI);
        // Loo.PI = 3.14;  // 编译错误，常量不能被改变


        // 下面这段代码发生了什么事？
        // 加载Loo.class到方法去区域中
        // 静态变量num一并存储到方法区中
        // 到方法区中获取num的值并输出
        System.out.println(Loo.num);

        // 编译器在编译时会将常量直接替换为具体的数值，效率高
        // 相当于System.out.println(5)
        System.out.println(Loo.NUM);
    }
}

class Loo{
    public static int num =10;
    public static final int NUM = 20;

    public static final double PI = 3.1415926;
}
