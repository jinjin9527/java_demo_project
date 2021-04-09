package co.jp.javademoproject.part2.homework.item1;

public class Item1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + a + a-- - a-- + ++a;
        // 実行の順番：左から右へ
        // a++ は 「a」の値を参照してから、加算
        // ++a は 加算してから、「a」の値を参照する

        //   a++ + a + a-- - a-- + ++a;
        // ⇒ 10 + a + a-- - a-- + ++a;   a「10」 a++「10」 a「11」
        // ⇒ 10 + 11 + a-- - a-- + ++a;  a「11」
        // ⇒ 10 + 11 + 11 - a-- + ++a;   a「11」 a--「11」 a「10」
        // ⇒ 10 + 11 + 11 - 10 + ++a;    a「10」 a--「10」 a「9」
        // ⇒ 10 + 11 + 11 - 10 + 10;     a「9」  ++a「10」 a「10」
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
