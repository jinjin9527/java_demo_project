package co.jp.javademoproject.part1.homework.item1;


import co.jp.javademoproject.part1.homework.item1.sub1.Sub1;

public class Item1a {

    public static void main(String[] args) {

        // 同じパッケージ  import：不要
        Item1b i1b = new Item1b();

        // java.langに属するクラス  import：不要
        String a = new String("123");

        // java.lang.Integerも　import：不要
        Integer ccc = 1;

        // サブパッケージに属するクラス  import：要
        Sub1 sub1 = new Sub1();
        System.out.println(a);
        co.jp.javademoproject.part1.homework.item2.Sample sample1 = new co.jp.javademoproject.part1.homework.item2.Sample();
        co.jp.javademoproject.part1.homework.item5.Sample sample5 = new co.jp.javademoproject.part1.homework.item5.Sample();
    }

}
