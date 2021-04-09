package co.jp.javademoproject.part2.homework.item2;

public class Item2 {
    public static void main(String[] args) {
        String a = new String("sample");
        String b = "sample";
        // ↓ 何を比較しようとする？
        System.out.print(a == b);
        System.out.print(", ");
        // ↓ 何を比較しようとする？
        System.out.print(a.equals(b));
    }
}
