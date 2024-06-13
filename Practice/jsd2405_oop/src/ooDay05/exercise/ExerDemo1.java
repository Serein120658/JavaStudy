package ooDay05.exercise;

/**
 * 1. 完成Point类，演示访问控制修饰符的用法
 */
public class ExerDemo1 {
    // JavaBean规范,变量私有化，提供getter和setter方法，方法公开化
    private int x;
    private int y;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}
