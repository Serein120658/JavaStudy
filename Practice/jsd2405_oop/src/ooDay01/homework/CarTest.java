package ooDay01.homework;

public class CarTest {
    public static void main(String[] args) {
        /*
         - CarTest类：创建对象，访问测试
         */
        //  调用无参构造方法 创建对象
        Car bbm = new Car();
        bbm.brand = "宝马";
        bbm.color = "黑色";
        bbm.price = 339999.99;
        bbm.start();
        bbm.run();
        bbm.stop();

        // 调用有参构造方法 创建对象
        Car xiaomi = new Car("小米", "橄榄绿", 219999.99);
        xiaomi.start();
        xiaomi.run();
        xiaomi.stop();

    }
}
