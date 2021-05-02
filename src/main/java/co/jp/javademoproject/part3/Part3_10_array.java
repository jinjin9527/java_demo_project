package co.jp.javademoproject.part3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Part3_10_array {

    public static void main(String[] args) {

        // 7.API介绍
        // 通过java.util.Arrays类来方便的操作数组 达到 想要的效果
        int a[] = {3, 5, 4, 8, 1};
        int b[] = {3, 5, 4, 8, 2};
        // 打印数组
        System.out.println("print array a : " + Arrays.toString(a));

        // 查找数组中的数 二分查找法
        System.out.println("binarySearch a [8]: " + Arrays.binarySearch(a, 8));

        // 查看两个数组中的 每个数 是否相等
        System.out.println("equals a b : " + Arrays.equals(a, b));

        // 排序
        Arrays.sort(a);
        System.out.println("sort result a : " + Arrays.toString(a));

    }

}
