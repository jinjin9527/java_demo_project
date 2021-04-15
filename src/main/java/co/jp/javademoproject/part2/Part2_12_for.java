package co.jp.javademoproject.part2;

import java.util.List;

public class Part2_12_for {
    public static void main(String[] args) {
        // 規則： for(index : array){...}

        int[] intArray = {1, 2, 3, 4, 5};
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        String[] strArray = {"A", "B", "C", "D"};
        // 不仅仅是基础类型
        // 对象类型也可以用增强for
        // 增强for
        for (String i : strArray) {
            System.out.print(i + " ");
        }
    }
}
