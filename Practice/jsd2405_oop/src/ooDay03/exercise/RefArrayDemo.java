package ooDay03.exercise;

/**
 * - 设计Dog数组dogs，Chick数组chicks，Fish数组fish，各自填充数据，遍历数组，访问元素的属性及调用方法
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        // 原始赋值，记得实例化
        dogs[0] = new Dog();
        dogs[0].name = "旺财";
        dogs[0].age = 3;
        dogs[0].color = "白色";

        // 实例化赋值

        dogs[1] = new Dog("小黄", 2, "黄色");
        dogs[2] = new Dog("小黑", 1, "黑色");

        // 遍历引用类型数组
        for(int i = 0; i < dogs.length; i++){
            // 访问属性
            System.out.println(dogs[i].name + " " + dogs[i].age + " " + dogs[i].color);
            // 访问父类方法
            dogs[i].drink();
            // 访问子类的普通方法
            dogs[i].lookHome();
            // 访问子类重写的抽象方法
            dogs[i].eat();
            // 访问重写后的接口方法
            dogs[i].swim();
        }

        // chick类
        Chick[] chicks = new Chick[3];
        chicks[0] = new Chick("小黄", 2, "黄色");
        chicks[1] = new Chick("小黑", 1, "黑色");
        chicks[2] = new Chick("小绿", 3, "绿色");
        for(int i = 0; i < chicks.length; i++){
            System.out.println(chicks[i].name + " " + chicks[i].age + " " + chicks[i].color);
            chicks[i].drink();
            chicks[i].eat();
            chicks[i].layEggs();
            // chicks[i].swim(); // 报错，因为chick类没有实现Swim接口
        }

        Fish[] fish = new Fish[3];
        fish[0] = new Fish("小黄", 2, "黄色");
        fish[1] = new Fish("小黑", 1, "黑色");
        fish[2] = new Fish("小绿", 3, "绿色");
        for(int i = 0; i < fish.length; i++){
            System.out.println(fish[i].name + " " + fish[i].age + " " + fish[i].color);
            fish[i].drink();
            fish[i].eat();
            fish[i].swim();
        }

    }
}
