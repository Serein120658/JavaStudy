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


    }
}
