package ooDay05;

/**
 * 演示访问权限
 * 标准JavaBean的规范：
 * 1、成员变量要私有，私有的成员变量要提供getter和setter方法
 * 2、每个类里面都有一个公开的无参的构造方法
 */
public class Point {
    private int x;
    private int y;

    // 公开的无参构造方法，实例化
    public Point() {
    }

    // 提供公开的getter和setter方法
    public int getX() { // getter方法
        return x;
    }

    public void setX(int x) {  // setter方法
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
