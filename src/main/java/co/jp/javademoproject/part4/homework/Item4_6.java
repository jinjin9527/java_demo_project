package co.jp.javademoproject.part4.homework;

import java.util.Map;

public class Item4_6 {

    public static void main(String[] args) {
        method2();
    }
    // longを使う、intだと範囲オーバー
    public static void method1() {
        long sum = 0;
        for (int i = 1; i <= 20; i++) {
            long num = 1;
            for (int j = 1; j <= i; j++) {
                num *= j;
            }
            sum += num;
        }
        System.out.println(sum);
    }

    public static void method2(){
        long sum = 0;
        for(int i = 1 ; i <= 20 ; i++){
            sum += product(i);
        }
        System.out.print(sum);
    }
    private static long product(int num){
        long product1 = 1;
        for(int i = num; i > 1 ; i--){
            product1 *= i;
        }
        return product1;
    }



}
