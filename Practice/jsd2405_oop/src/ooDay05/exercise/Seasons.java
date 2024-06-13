package ooDay05.exercise;

public enum Seasons {
    // 枚举，第一行必须枚举对象
    SPRING("春天","春暖花开"){
        @Override
        void show()
        {
            System.out.println("名:" + SPRING.name + "，描述：" + SPRING.desc);
        }
    },
    SUMMER(){
        @Override
        void show(){
            System.out.println("夏天到了");
        }
    },
    AUTUMN(),
    WINTER();

    // 枚举构造方法
    Seasons() {
    }

    // 将枚举当作一个类来使用
    // 有参构造
    // 私有属性
    private String name;
    private String desc;
    Seasons(String name,String desc) {
        this.name = name;
        this.desc = desc;
    }

    // 枚举对象中可以定义方法
    void show() {
        System.out.println("这是一个季节");
    }
}
