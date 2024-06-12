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
        // 2. 为该派生类创建了一个对象，叫inter
        // ----- new Inter(){};是在创建Inter的派生类的对象
        Inter inter = new Inter() {};

        // 1.创建了一个Inter的派生类，但是没有名字  与前面创建的派生类不相同
        // 2.为该派生类创建了一个对象名为inter1
        Inter inter1 = new Inter(){};


    }
}

interface Inter{

}
