package co.jp.javademoproject.part1;

public class Part1_6 {
    public static void main(String[] args) {
        String abc = "0" + 1 + 1.5d + true;
        // 下記はエラー
        // int abc = 1 + 1.5d + true + "0";
        System.out.println("abc : " + abc);

        double x = 3.14;
        int nx = (int) x;
        System.out.println("nx : " + nx);
        char c = 'a';
        int d = c + 1;
        System.out.println("d : " + d);
        System.out.println("d : " + (char) d);

        int x1 = 300;
        byte bx = (byte) x1;
        System.out.println("bx : " + bx);

        int money = 1000000000; //10亿
        int years = 20;
        int total = money * years;
        long total1 = money * years;
        long total2 = money * ((long) years);
        System.out.println("total : " + total);
        System.out.println("total1 : " + total1);
        System.out.println("total2 : " + total2);
    }
}

