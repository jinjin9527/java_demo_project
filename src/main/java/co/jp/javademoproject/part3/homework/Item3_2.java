package co.jp.javademoproject.part3.homework;

public class Item3_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int total = 0;
        for (int i : array) {
            if (i % 2 == 0)
                continue;
                // 注意！！
                total += i;
        }
        System.out.println(total);
    }
}
