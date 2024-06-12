package ooDay04;

/**
 * 多态演示
 * 向上造型
 * 超类型的引用类型指向子类对象
 * 应用1：将超类作为参数类型，传递派生类对象    以扩大方法的应用范围   实现代码复用
 * 应用2：将超类作为返回类型，返回派生类对象
 * 向下造型
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        // 向上造型的演示   引用类型   变量 = new 子类() ---> 对象;
        Dog d1 = new Dog("小黑", 2, "黑色");
        d1.drink(); // 调用的是子类中的drink方法
        d1.eat(); // 调用的是对象d1的eat重写方法
        d1.lookHome(); // 调用的是子类中的lookHome方法
        d1.swim(); // 调用的是子类中的swim方法

        Animal a1 = new Dog("小白", 2, "白色");
        a1.drink(); // 调用的是父类中的drink方法
        a1.eat(); // 调用的是对象a1的eat重写方法
        // a1.lookHome(); // 编译错误，因为引用的是父类，没有lookHome方法

        Swim s1 = new Dog("小黄", 2, "黄色");
        s1.swim(); // 调用的是子类中的swim方法

        // 创建一个主人对象,向上造型的第一点应用
        Master m1 = new Master();
        m1.feed(a1); // 调用的是feed方法，参数是Animal类型，所以可以传入Dog对象

        Animal a2 = new Chick("坤哥",24,"背带裤");
        m1.feed(a2); // 喂鸡

        Animal a3 = new Fish("鱼", 1, "青色");
        m1.feed(a3);

        // 我们创建的是Dog引用类型，Dog对象，但是我们需要传递的参数是Animal类型，为什么可以传递过去呢？
        // 在传参的同时，系统自动向上造型。对于feed方法，Animal animal = a4;
        Dog a4 = new Dog("小黑", 2, "黑色");
        m1.feed(a4);
    }
}
