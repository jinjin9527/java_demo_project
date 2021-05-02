package co.jp.javademoproject.part4.homework;

public class Item4_3 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D"};

        // {null, "B", "C", "D"}になる
        array[0] = null;
        for (String str : array) {
            // nullをprintlnの場合、文字列"null"を出力する
            System.out.println(str);
        }
    }
}
