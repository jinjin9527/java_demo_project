package co.jp.javademoproject.part3;

public class Part3_1_method {
    // 1.什么是方法？
    // Java方法是语句的集合，它们在一起执行一个功能。
    // 方法是解决一类问题的步骤的有序组合
    // 方法包含于类或对象中
    // 方法在程序中被创建，在其他地方被引用

    // 2.方法的优点
    // 使程序变得更简短而清晰
    // 有利于程序维护
    // 可以提高程序开发的效率
    // 提高了代码的重用性
    // max a b  c d
    public static void main(String[] args) {

        int a = 2323;
        int b = 3434;
        int max = 0;



        int c = 56756;
        int d = 8877;
        if (c > d) {
            max = c;
        } else {
            max = d;
        }
        // JAVAソースを参考してください。
        System.out.println(123);
    }


    public static long max(long num1, long num2) {
        long result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
}
