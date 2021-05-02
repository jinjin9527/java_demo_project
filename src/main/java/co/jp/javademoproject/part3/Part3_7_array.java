package co.jp.javademoproject.part3;

import java.lang.reflect.Array;

public class Part3_7_array {

    public static void main(String[] args) {

        // 4.数组的初期化
        // 方式1：创建时指定数组元素和大小
        int[] a = {1, 2, 3};
        // 方式2：先声明 后 赋值
        int[] b = new int[2];

        b[0] = 1;
        b[1] = 2;
        // 声明后的默认值
        int [] c = new int[3];
        printArray(c);
        // 边界&下标[从0开始]
        System.out.println(c.length);
        System.out.println(c[0]);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
