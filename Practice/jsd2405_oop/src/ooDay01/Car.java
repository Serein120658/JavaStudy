package ooDay01;

public class Car {
    String brand;
    String color;
    double price;

    // 无参构造
    Car(){

    }
    // 构造方法重载
    Car(String brand,String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // 汽车启动
    void start(){
        System.out.println(brand + "的" + color + "颜色的" + price + "元的车启动了");
    }

    // 汽车跑起来
    void run(){
        System.out.println(brand + "的" + color + "颜色的" + price + "元的车开始跑了");
    }

    // 汽车停止
    void stop(){
        System.out.println(brand + "的" + color + "颜色的" + price + "元的车停止了");
    }

}
