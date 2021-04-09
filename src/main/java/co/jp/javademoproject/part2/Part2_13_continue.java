package co.jp.javademoproject.part2;

public class Part2_13_continue {
    public static void main(String[] args) {
        // 規則：次の繰り返しに移す
        int[] intArray = {1, 2, 3, 4, 5};
        for (int i : intArray) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("END");
    }
}
