package ooDay04;

public class Master {
    Master(){
        System.out.println("我是主人");
    }
    // 喂动物
    public void feed(Animal animal) {
        animal.eat();
    }
}
