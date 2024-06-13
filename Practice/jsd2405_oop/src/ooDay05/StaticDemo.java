package ooDay05;

/**
 * 实例变量:没有static修饰，属于对象，
 * 静态变量
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
