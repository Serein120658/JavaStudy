package ooDay05.exercise;

/**
 *2. 完成StaticVar、StaticBlock、StaticMethod，StaticDemo，演示static关键字的用法
 */
public class ExerDemo2 {
    public static void main(String[] args) {
        // 静态变量,属于类所有，不属于对象
        // 存储在方法区当中，
        StaticVar var = new StaticVar();
        var.show();

        StaticVar var1 = new StaticVar();
        var1.show();

        StaticVar var2 = new StaticVar();
        var2.show();

        /* 输出结果 a是静态变量   b是实例变量
         * a=1 b=1
         * a=2 b=1
         * a=3 b=1
         * 出现这样的结果，是因为静态变量存储在方法区当中，实例变量存储在堆当中
         * 每次实例化都是在堆当中创建新的的对象，而每次创建的对象里面的b都是从默认值0加1  所以b一直为1
         * 静态变量存储在方法区当中，而每次调用show方法的时候，都是在同一个方法区里面的a
         */

        StaticBlock block = new StaticBlock();
        StaticBlock block1 = new StaticBlock();
        StaticBlock block2 = new StaticBlock();

        /*
        * 静态方法，属于类所有，不属于对象
        * 输出结果:
        * 静态块
          构造方法
          构造方法
          构造方法
          * 静态块是在类加载的时候就执行，所以静态块先执行，但是只执行一次
         */

        /*
        * 静态方法，属于类所有，不属于对象 使用类名.方法名()调用
        * 静态方法：不需要实例化对象，直接通过类名调用，静态方法中不能使用this、super关键字，静态方法中不能使用非静态变量，
        * 何时用：不需要访问对象的属性和行为
         */
        System.out.println(StaticMethod.sum(1,200));
    }
}
