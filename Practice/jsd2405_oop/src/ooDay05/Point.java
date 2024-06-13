package ooDay05;

/**
 * 演示访问权限
 * 标准JavaBean的规范：
 * 1、成员变量要私有，私有的成员变量要提供getter和setter方法，没有它就获取不到数据
 * 可以将设计getter和setter理解为一种行业标准
 * 2、每个类里面都有一个公开的无参的构造方法
 * 3、可以更好的保证数据的合法性(因为方法中可以做条件控制)
 * 4、getter和setter可以选择性存在(只有getter(只读)，或者只有setter(只写))
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
