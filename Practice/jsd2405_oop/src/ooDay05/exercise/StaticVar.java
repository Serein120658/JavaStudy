package ooDay05.exercise;

/**
 * 静态变量,属于类，一般在静态块中初始化
 */
public class StaticVar {
    // 静态变量
    static int a;
    int b;
    // 构造方法
    StaticVar(){
        a++;
        b++;
    }
    void show()
    {
        System.out.print("a="+a + " ");
        System.out.println("b="+b);
    }
}
