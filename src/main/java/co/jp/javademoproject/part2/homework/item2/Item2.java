package co.jp.javademoproject.part2.homework.item2;

public class Item2 {
    public static void main(String[] args) {
        String a = new String("sample");
        String d = new String("sample");
        String b = "sample";
        String c = "sample";
        // ↓ 何を比較しようとする？是否指向同一个对象
        System.out.println(a == b);
        System.out.println(b == c);//true
        System.out.println(a == d);
        System.out.println(", ");
        // ↓ 何を比較しようとする？值是否一样
        System.out.print(a.equals(b));
    }
}
