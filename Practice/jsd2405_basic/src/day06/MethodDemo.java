package day06;

/**
 * 方法的练习
 */
public class MethodDemo {
    public static void main(String[] args) {
        // 无参，无返回值方法调用
        sayHello();

        // 有参，无返回值方法调用
        makeFriends("小明");

        // 有参，有返回值方法调用
        makeMarriage("阿尔特曼","维丽娜");

    }

    // 说好
    public static void sayHello()
    {
        System.out.println("Hello World!");
    }

    // 交朋友
    public static void makeFriends(String name)
    {
        System.out.println("我想和"+name+"交朋友");
    }

    // 求婚
    public static void makeMarriage(String male,String female)
    {
        System.out.println(male + "正在向" + female + "求婚");
    }
}
