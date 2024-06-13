package ooDay05;

/**
 * 静态块
 * 静态块在类加载的时候执行，只执行一次
 * 静态块在构造方法之前执行
 */
public class StaticBlock {
    // 静态块
    static{
        System.out.println("静态块");
    }
    // 构造方法
    StaticBlock(){
        System.out.println("构造方法");
    }
}
