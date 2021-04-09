package co.jp.javademoproject.part1.homework.item4;

public class Main {
    public static void main(String[] args) {
        String str = "abced";
        int length = str.length();
        System.out.println(length);
        // length : 5
        // charAt 0からスタート、要するに、最大str.charAt(4) ： 'd'になる。5をいれると、実行時エラーになる。
        System.out.println(str.charAt(str.length() -1));
    }
}
