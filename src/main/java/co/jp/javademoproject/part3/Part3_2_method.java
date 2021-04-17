package co.jp.javademoproject.part3;

public class Part3_2_method {

    // 3.方法的定义
    // 修饰符 返回值类型 方法名(参数类型 参数名){
    //   ... 方法体 ...
    //   return 返回值;
    // }

    // 修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。

    // 返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需
    //            的操作，但没有返回值。在这种情况下，returnValueType 是关键字void。

    // 方法名：是方法的实际名称。方法名和参数表共同构成方法签名。

    // 参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参
    //         数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。

    // 4.方法的调用
    public static void main(String[] args) {
        int maxNum = max(3, 5);
        printResult("maxNum : " , maxNum);
        int addNum = max(3, 5);
        printResult("addNum : " , addNum);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void printResult(String name, int result){
        System.out.println(name + result);
    }
}
