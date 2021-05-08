package co.jp.javademoproject.part4.homework;

import java.util.Arrays;

public class Item4_4 {
    public static void main(String[] args) {
        int[][] arrayA = {{1, 2}, {1, 2}, {1, 2, 3}};
        // clone 浅拷贝
        int[][] arrayB = arrayA.clone();
        arrayA[0][0] = 100;

        // 深拷贝
//        int[][] arrayC = {{1, 2}, {1, 2}, {1, 2, 3}};
//        int[][] arrayD = Arrays. arrayC.clone();
//        arrayC[0][0] = 100;
        // arrayD sum = 12;

        int total = 0;
        for (int[] tmp : arrayB) {
            for (int val : tmp) {
                total += val;
            }
        }
        System.out.println(total);
    }
}
