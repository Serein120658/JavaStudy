package day06;

/**
 * debug调试工具
 * debug运行程序，程序会自动到第一个断点处，暂停
 * F7 进入方法体，逐步调试(会进入到方法中)
 * F8 跳过方法体，逐过程调试（不会进入到方法中）
 * F9 跳过当前断点，到下一个断点，若后面没有断点，则会调试结束。
 *
 */
public class DebugDemo {
    public static void main(String[] args) {
        test();
        test("test");
        sum(1,2);
    }

    public static void test(){
        System.out.println("test");
    }

    public static void test(String name){
        System.out.println("test2" + name);
    }

    public static void sum(int num1,int num2){
        int sum = num1 + num2;
        int m = sum;
        System.out.println(m);
    }

}
