package co.jp.javademoproject.part1;

public class Part1_5 {
    public static void main(String[] args) {

        String s5 = "a\tb";
        System.out.println(s5);
        // メモリ ： |s1|||s2|
        // メモリ： ||hello world||
        String s1 = new String("Hello world");
        String s2 = new String("Hello world");
        System.out.println(s1==s2);
        String s3="Hello world";
        String s4="Hello world";
        System.out.println(s3==s4);
    }
}

