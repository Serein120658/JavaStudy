package ooDay04;

/**
 * 匿名内部类
 */
public class AnonInnerClassDemo {
    public static void main(String[] args) {
        // Inter inter = new Inter(); // 编译出错，接口不能实例化

        // 下面这段代码发生了什么？
        // 1. 创建了Inter的一个派生类，但是没有名字
        // 等价   class Aoo implements Inter{}
        // ,但是这个是有名字的，可以被调用很多次
        // 2. 为该派生类创建了一个对象，叫inter 向上造型为Inter
        // ----- new Inter(){};是在创建Inter的派生类的对象
        Inter inter = new Inter() {};

        // 1.创建了一个Inter的派生类，但是没有名字  与前面创建的派生类不相同
        // 2.为该派生类创建了一个对象名为inter1  向上造型为Inter
        Inter inter1 = new Inter(){};


        // 创建了一个InterInter的派生类，但是没有名字
        // 创建了派生类的一个对象，名叫interinter   同时向上转型为InterInter
        // 大括号里面的内容为派生类的类体    可以简写，在后续的课程当中会讲到
        InterInter interinter = new InterInter(){
            // 重写抽象方法
            public void show(){
                System.out.println("show");
            }
        };

        interinter.show();

    }
}

interface Inter{

}

interface InterInter{
    void show();
}
