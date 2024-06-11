package ooDay03;

public class SwimTest {
    public static void main(String[] args) {
        // Swim 接口 中的swim方法
        Dog dog = new Dog("旺财", 3, "黄色");
        dog.eat(); // Dog类当中重写的eat()方法
        dog.lookHome(); // Dog类当中重写的lookHome()方法
        dog.swim(); // Dog类当中重写的swim()方法
        dog.drink(); // 复用父类中的drink()方法

        Chick chick = new Chick("小鸡", 1, "白色");
        chick.eat(); // Chick类当中重写的eat()方法
        chick.layEggs(); // Chick类当中重写的layEggs()方法
        chick.drink(); // 复用父类中的drink()方法

        Fish fish = new Fish("波妞", 1, "粉色");
        fish.eat(); // Fish类当中的eat()方法
        fish.swim(); // Fish类当中重写的swim()方法
        fish.drink(); // 复用父类中的drink()方法
    }
}
