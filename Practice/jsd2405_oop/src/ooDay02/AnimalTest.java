package ooDay02;

public class AnimalTest {
    public static void main(String[] args) {
        // 创建狗类
        Dog dog = new Dog("旺财", 3, "黄色");
        dog.lookHome();
        dog.eat();
        dog.drink();

        // 创建鸡类 名叫爱坤 年龄22 颜色背带裤
        Chick chick = new Chick("爱坤", 22, "背带裤");
        chick.layEggs();
        chick.eat();
        chick.drink();

        // 创建🐟  名叫波妞 年龄3 颜色粉白
        Fish fish = new Fish("波妞", 3, "粉白");
        fish.eat();
        fish.drink();

    }
}
