package co.jp.javademoproject.part3;

public class Part3_3_method {

    // 4.方法的重载「オーバーロード」
    // 如果你调用max方法时传递的是int型参数，则 int型参数的max方法就会被调用；
    // 如果传递的是long型参数，则long类型的max方法体会被调用，这叫做方法重载；
    // 就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表。
    // Java编译器根据方法签名判断哪个方法应该被调用。
    // 方法重载可以让程序更清晰易读。执行密切相关任务的方法应该使用相同的名字。
    // 重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。
    public static void main(String[] args) {
        int a_int = 1;
        int b_int = 2;
        System.out.println(max(a_int, b_int));
    }

    public static int max(int num1, int num2) {
        System.out.println("max (int int)  ");
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }

//    public static long max(long num1, int num2,long num1, int num2,long num1, int num2,long num1, int num2,long num1, int num2) {
//        System.out.println("max (long int)  ");
//        long result;
//        if (num1 > num2)
//            result = num1;
//        else
//            result = num2;
//        return result;
//    }

    public static int max(int num1, int num2, int num3) {
        System.out.println("max (int int int)  ");
        return Math.max(num1, Math.max(num2, num3));
    }


}
