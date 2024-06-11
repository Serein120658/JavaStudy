package ooDay03;

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
    }
}
