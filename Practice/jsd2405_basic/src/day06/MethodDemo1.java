package day06;

/**
 * 方法的重载
 * 方法的重载：方法的名称相同，但是参数列表不同
 * 方法重载的好处：
 * 增强程序的可读性
 * 重载允许使用相同的方法名,但根据传入的参数类型和数量的不同自动选择对应的方法。这样可以增强代码的可读性,因为程序员不必记住多个不同的方法名,只需通过参数列表判断调用哪一个版本的方法。
 * 提高代码的可维护性
 * 重载方法往往与业务需求相关,当业务发生变化时,只需添加新的重载方法而不影响其他版本,这样就避免了对现有代码的大规模修改,提高了代码的可维护性。
 * 减少重复代码
 * 如果没有重载,当需要实现类似功能时,就要定义多个功能相近但参数不同的方法,造成冗余。使用重载则可以将功能相似的代码集中在一个方法名下,减少了重复代码。
 * 支持编程的多态特性
 * 重载实际上是Java多态思想的一种体现。通过相同的方法名调用不同的方法版本,可以实现在运行时根据传入参数动态绑定的效果。
 * 简化对外接口
 * 重载可以让调用者只需记住一个方法名,就可以根据需求传入不同的参数完成调用,而不必记住多个不同的方法,从而简化了对外的接口。
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        // 调用方法
        sayHello();
        sayHello("Tom");
        sayHello("Jerry",2330);
    }

    public static void sayHello() {
        System.out.println("Hello World!");
    }
    public static void sayHello(String name) {
        System.out.println("Hello "+name+"!");
    }
    public static void sayHello(String name,int age) {
        if(age>1110) {
            System.out.println("Invalid age!");
            return;
        }
        System.out.println("Hello "+name+"! Your age is "+age+".");
    }
}
