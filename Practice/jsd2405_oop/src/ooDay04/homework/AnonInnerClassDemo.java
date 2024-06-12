package ooDay04.homework;

public class AnonInnerClassDemo {
    public static void main(String[] args) {
        // 创建2个Inter的匿名内部类对象
        Inter inter1 = new Inter(){};
        Inter inter2 = new Inter(){};

        // 创建2个InterInter的匿名内部类对象
        InterInter interinter1 = new InterInter(){
          // 重写抽象方法
          public void show(){
              System.out.println("show");
          }
        };

        interinter1.show();

        InterInter interinter2 = new InterInter(){
            public void show(){
                System.out.println("show");
            }
        };
        interinter2.show();

    }
}
