package ooDay04;

/**
 * 多态演示
 * 向上造型
 * 超类型的引用类型指向子类对象
 *
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

    }
}
