package co.jp.javademoproject.part1;

import java.math.BigDecimal;

public class Part1_3 {
    public static void main(String[] args) {
        // 二進数 JRE7から
        int a = 0b0101;

        // 十進数
        int i=10;

        // 数字分割_  JRE7から
        int i4 = 1_2234_5678;

        // 八進数 0から始まり
        int i2=010;

        // 十六進数 0xから始まり
        int i3=0x10;

        // 5
        System.out.println(a);
        // 10
        System.out.println(i);
        // 8
        System.out.println(i2);
        // 16
        System.out.println(i3);
        // 122345678
        System.out.println(i4);

        float f = 0.1f;
        double d = 1.0/10;
        //false
        System.out.println(f==d);

        float d1 = 2131231231f;
        float d2 = d1+1;
        if(d1==d2){
            System.out.println("d1==d2"); }
        else{
            System.out.println("d1!=d2");
        }

        BigDecimal test1 = new BigDecimal(2131231231f);
        BigDecimal test2 = test1.add(new BigDecimal(1));

        if(test1.compareTo(test2) == 0){
            System.out.println("test1==test2"); }
        else{
            System.out.println("test1!=test2");
        }
    }
}

