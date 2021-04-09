package co.jp.javademoproject.part1.homework.item5;

public class Sample {
    public int a;
    public boolean c;
    //为什么会有final
    public final long d = 1000;
    public static void main(String[] args) {
        int b = 9;
        int catch1 =1;
        Sample sample1 = new Sample();
        System.out.println(sample1.a);
//        System.out.println(b);
//        System.out.println(sample1.c);
//        System.out.println(sample1.d);
//        sample1.d = 11;

        catch1+=5;
        catch1 = catch1 +5;
        sample1.a = 999;
        boolean aaa = 5==5;

        System.out.println(sample1.a);
//
//        StringBuilder sb = new StringBuilder("abcde");
//        // 01234
//        // abcde
//        //  bcd
//        //  ↑
//        // そのため、indexOfは文字列位置の開始位置を検索するメソッドである。
//        System.out.println(sb.indexOf("bcd"));
    }
}
