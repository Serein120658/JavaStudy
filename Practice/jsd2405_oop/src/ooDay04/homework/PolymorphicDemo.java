package ooDay04.homework;

public class PolymorphicDemo {
    public static void main(String[] args) {
        // 创建animal数组，并填充Dog/Chick/Fish对象，遍历数组
        Animal[] animals = new Animal[5];
        // 创建Dog对象
        animals[0] = new Dog("旺财", 3, "黄色");
        animals[1] = new Dog("佐藤", 2, "黑色");

        animals[2] = new Chick("坤坤",26,"黑白色");
        animals[3] = new Chick("鸡你太美",3,"金黄色");

        animals[4] = new Fish("波妞",12,"粉色");

        // 输出每个动物的名字，让每个动物吃饭喝水
        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
            // 向下造型
            if(animals[i] instanceof Dog){
                Dog dog = (Dog) animals[i];
                dog.lookHome();
            }
            if(animals[i] instanceof Chick){
                Chick chick = (Chick) animals[i];
                chick.layEggs();
            }

            //
            if(animals[i] instanceof Swim){
                Swim swim = (Swim) animals[i];
                swim.swim();
            }
        }
        System.out.println("---------");
        // 创建Master对象、Dog对象，Fish对象，Chick对象
        Master master = new Master();
        for(int i = 0; i < animals.length; i++){
            master.feed(animals[i]);
        }
    }
}
