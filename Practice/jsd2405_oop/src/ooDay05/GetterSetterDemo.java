package ooDay05;

/**
 * getter和setter测试
 */
public class GetterSetterDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(10);
        p.setY(20);
        System.out.println("x = " + p.getX());
        System.out.println("y = " + p.getY());
    }
}
