package ooDay05;

/**
 * 实例变量:没有static修饰，属于对象，存储在堆当中，有几个对象就有几份  由对象/引用访问
 * 静态变量：有static修饰，属于类，存储在方法区，只有一份   由类名访问    共享数据的时候使用，好处节约内存
 */
public class StaticDemo {
    public static void main(String[] args) {

        StaticVar o1 = new StaticVar();
        o1.show();

        StaticVar o2 = new StaticVar();
        o2.show();

        StaticVar o3 = new StaticVar();
        o3.show();

        // 访问静态变量，常常由类名.访问
        System.out.println(StaticVar.b);

    }
}
