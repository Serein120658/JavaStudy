package ooDay01.homework;

public class Car {
    /*
       - Car类：brand(品牌)，color，price，构造方法()，start()、run()、stop()
     */
    String brand;
    String color;
    double price;
    // 无参构造方法
    Car(){}

    // 有参
    Car(String brand,String color, double price)
    {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // start()方法
    void start() {
        System.out.println(brand + "牌子的"+color + "颜色的"+ price + "块钱的车启动了");
    }
    // run()方法
    void run() {
        System.out.println(brand + "牌子的"+color + "颜色的"+ price + "块钱的车正在跑");
    }

    // stop()方法
    void stop() {
        System.out.println(brand + "牌子的"+color + "颜色的"+ price + "块钱的车停止了");
    }

}
