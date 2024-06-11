package ooDay03;

/**
 * 接口是一种引用数据类型
 * 有interface定义
 * 接口当中的方法默认都是抽象的，前面默认有abstract
 * 接口当中的变量默认都是常量，前面默认有final
 */

public interface Swim {
    void swim();  // 相当于 abstract void swim(); 注意没有方法体,子类继承的接口必须实现接口中的方法
}
