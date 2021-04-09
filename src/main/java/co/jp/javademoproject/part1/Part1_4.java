package co.jp.javademoproject.part1;

public class Part1_4 {
    public static void main(String[] args) {
        // 一重引用符は、文字定数を示すために使用されます。
        // たとえば、'A'は"A"とは異なり、'A'はchar "A"はString
        //char型は、Unicodeコードテーブルの文字を表すために使用されます。
        //Unicodeエンコーディングは、さまざまな言語のすべてのテキストを処理するように設計されています。
        // 2バイトを占有し、65536文字を使用できます。

        char c1 = 'a';
        char c2 = '感';
        System.out.println(c1);
        System.out.println((int) c1); //97
        System.out.println(c2);
        System.out.println((int) c2);

        String A = "a";
        // Unicodeには0〜65535の範囲のコードがあり、
        // 通常は「u0000」から「uFFFF」までの16進値で表されます
        // （プレフィックスはuはUnicodeを意味します）
        char c3 = '\u0061';
        System.out.println(c3);
        System.out.println(A);
    }
}


