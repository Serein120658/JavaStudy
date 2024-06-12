package ooDay04;

/**
 * 成员内部类：
 * 类中套类，外面的类称为外部类，里面的类称为内部类
 * 内部类通常只服务于外部类，对外不具备可见性
 * 内部类对象通常在外部类中创建
 * 内部类可以直接访问外部类的成员变量和成员方法，有个引用隐式的外部类对象 外部类.this.外部类成员
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        // 创建Mama对象
        Mama m = new Mama();
        // Baby b = new Baby(); // 编译错误 内部类不能new
        m.create();
        // m.new Baby().show();
    }
}

class Mama {  // 外部类
    String name;
    // 只能在外部类内new对象
    void create(){
        Baby b = new Baby();
        b.show();
    }
    // 内部类
    class Baby{
        void show(){
            System.out.println(name); // 相当于 System.out.println(Mama.this.name);
        }
    }
}
