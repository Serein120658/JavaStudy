package ooDay05;

public class StaticVar {
    int a; // 实例变量
    static int b; // 静态变量

    // 构造
    StaticVar(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a+",b="+b);
    }
}
