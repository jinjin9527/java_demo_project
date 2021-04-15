package co.jp.javademoproject.part2;

public class Part2_13_break {
    public static void main(String[] args) {
        // 規則：for循環から抜け出す。
        int[] intArray = {1, 2, 3, 4, 5};
        int result = 0;
        for (int i : intArray) {
            if (i == 3) {
                result = i;
                break;
            }
            System.out.println("for : index " + i);
        }
        // break 达到目标的时候 跳出循环
        System.out.println(result);
        System.out.println("END");

    }
}
