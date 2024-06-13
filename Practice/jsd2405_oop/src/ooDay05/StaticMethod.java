package ooDay05;

public class StaticMethod {
    int a;   // 实例变量(由对象访问)
    static int b; // 静态变量(由类名访问)

    // 静态方法何时使用：方法的操作对象无关，只和类有关(不需要访问对象的属性和行为)

    // 在say()中需要访问对象的属性和行为，所以认为say()的操作与对象无关
    void show(){ // 有隐式this
        System.out.println("a="+a+" b="+b);
    }

    // 在plus()中不需要访问对象的属性/行为，所以认为plus()的操作与对象无关，可以设计为静态方法
    static int plus(int num1,int num2){
        int num = num1+ num2;
        return num;
    }

    static void test(){
        // 静态方法当中没有隐式this传递
        // 没有this就意味着没有对象
        // 而实例变量a必须通过对象来访问
        // 所以如下语句发生编译错误
        // System.out.println(a); // 编译错误
        System.out.println(StaticMethod.b);
    }

}
