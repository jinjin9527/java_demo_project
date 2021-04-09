package co.jp.javademoproject.part2;

public class Part2_13_break {
    public static void main(String[] args) {
        // 規則：for循環から抜け出す。
        int[] intArray = {1, 2, 3, 4, 5};
        for (int i : intArray) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("END");

    }
}
