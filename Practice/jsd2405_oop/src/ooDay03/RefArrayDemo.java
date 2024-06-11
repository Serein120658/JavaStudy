package ooDay03;

import java.util.Arrays;

/**
 * 引用类型数组
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        // 声明Dog型数组dogs，包含三个元素，每个元素都为dog型，默认值为null
        Dog[] dogs = new Dog[3];  // 创建Dog数组对象
        dogs[0] = new Dog("旺财", 3, "黄色"); // 创建Dog对象
        dogs[1] = new Dog("小黄", 2, "黄色");
        dogs[2] = new Dog("小花", 2, "白色");


        //声明Chick型数组chick，包含三个元素，每个元素都为chick型，默认值为null
        Chick[] chicks = new Chick[3];
        chicks[0] = new Chick("小黄", 2, "黄色");
        chicks[1] = new Chick("小黄", 2, "黄色");
        chicks[2] = new Chick("小黄", 2, "黄色");

        //声明Fish型数组fish，包含三个元素，每个元素都为fish型，默认值为null
        Fish[] fishs = new Fish[3];
        fishs[0] = new Fish("小黄", 2, "黄色");
        fishs[1] = new Fish("小黄", 2, "黄色");
        fishs[2] = new Fish("小黄", 2, "黄色");
        for (int i = 0; i < dogs.length; i++) {
            // System.out.println(Arrays.toString(dogs[i]));
            dogs[i].eat();
            dogs[i].lookHome();
        }
        for (int i = 0; i < chicks.length; i++) {
            chicks[i].eat();
            chicks[i].layEggs();
        }
        for (int i = 0; i < fishs.length; i++) {
            fishs[i].eat();
            fishs[i].swim();
        }

        // 向上造型
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("旺财", 3, "黄色");
        animals[1] = new Chick("小黄", 2, "黄色");
        animals[2] = new Fish("小黄", 2, "黄色");

        animals[0].eat();  // 只能访问父类的方法和属性
        // animals[0].lockHome(); // 不能使用子类的方法

        // 向下造型,为了访问子类的方法，需要向下造型
        // 向下造型需要强制转换
        // 建议：在强转之前需要使用instanceof机进行判断是否是相应的类型
        Animal[] animals1 = new Animal[3];
        animals1[0] = new Dog("旺财", 3, "黄色");
        animals1[1] = new Chick("小黄", 2, "黄色");
        animals1[2] = new Fish("小黄", 2, "黄色");

        for(int i =0 ;i<animals1.length;i++){
            // 如果使用的是父类当中的属性或者方法，就不需要向下转型
            // 如果需要使用子类的属性或者方法，就需要向下转型
            // 向下转型实例
            if(animals1[i] instanceof Dog){
                // 强转
                Dog dog = (Dog)animals1[i];
                dog.lookHome(); // 使用子类特有的方法
            }
            if(animals1[i] instanceof Chick){
                Chick chick = (Chick)animals1[i];
                chick.layEggs(); // Chick类特有的方法
            }
        }

    }
}
