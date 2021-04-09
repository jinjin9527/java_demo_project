package co.jp.javademoproject.part2;

import java.util.List;

public class Part2_12_for {
    public static void main(String[] args) {
        // 規則： for(index : array){...}

        int[] intArray = {1, 2, 3, 4, 5};
        for (int i : intArray) {
            System.out.println(i);
        }

        String[] strArray = {"A", "B", "C", "D"};
        for (String i : strArray) {
            System.out.println(i);
        }
    }
}
