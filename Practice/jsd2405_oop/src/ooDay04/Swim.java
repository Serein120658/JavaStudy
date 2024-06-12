package ooDay04;

/**
 * 接口是一种引用数据类型
 * 有interface定义
 * 接口当中的方法默认都是抽象的，前面默认有abstract
 * 接口当中的变量默认都是常量，前面默认有final，变量名默认都是大写
 * 在其他类当中使用接口时，必须实现接口中的所有方法，重写时必须使用public 修饰符
 *
 */

public interface Swim {

    // 接口当中的变量
    int MAX_SPEED = 100; // 默认是public static final MAX_SPEED = 100;
    int MIN_SPEED = 0;
    void swim();  // 相当于 abstract void swim(); 注意没有方法体,子类继承的接口必须实现接口中的方法
}
