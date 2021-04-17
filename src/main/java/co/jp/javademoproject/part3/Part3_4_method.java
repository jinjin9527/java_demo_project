package co.jp.javademoproject.part3;

import java.util.Arrays;

public class Part3_4_method {

    // 5.可変引数
    // 在方法声明中，在指定参数类型后加一个省略号(...) 。
    // 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明
    // 为什么可变参数必须在最后？
    public static void main(String[] args) {
        int result1 = max(1, 2, 3, 4);
        System.out.println(result1);
        int result2 = max();
        System.out.println(result2);
    }

    public static int max(int ... nums) {
        System.out.println("max (int int int ...)  ");

        if (nums == null) {
            return -1;
        }
        int result = 0;
        for(int i : nums) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

//    public static int max(int a, int b, int ... nums) {
//        System.out.println("max (int int int ...)  ");
//        int result = max(nums);
//        if (result > a && result > b) {
//            return result;
//        } else {
//            if (a > b) {
//                return a;
//            } else {
//                return b;
//            }
//        }
//    }


//    public static long max(int num1, int num2) {
//        long result;
//        if (num1 > num2)
//            result = num1;
//        else
//            result = num2;
//        return result;
//    }

}
