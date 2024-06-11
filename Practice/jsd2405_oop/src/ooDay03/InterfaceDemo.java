package ooDay03;

// 两个测试接口
interface Inter1{
    static final int MAX_NUM = 100;
    void show();
}
interface Inter2{
    void show2();
}
// 创建一个测试类去实现接口
class InterfaceTest implements Inter1,Inter2 {
    // 重写
    public void show(){
        System.out.println("show");
    }
    // 重写
    public void show2(){
        System.out.println("show2");
    }

}

public class InterfaceDemo {
    public static void main(String[] args){
        // 接口不能被实例化,也就是不能被new
        // new Inter(){} 错误
        // Inter inter = new Inter(); 匿名类
        Inter inter = new Inter(){
            @Override
            public void show() {
                System.out.println("show");
            }
        };
        inter.show();

        // 创建测试实例
        InterfaceTest test = new InterfaceTest();
        test.show();
        test.show2();
    }
}
