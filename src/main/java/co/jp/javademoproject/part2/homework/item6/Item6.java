package co.jp.javademoproject.part2.homework.item6;

import java.util.stream.IntStream;

public class Item6 {
    public static void main(String[] args) {
        method1();
//        method2();
//        method3();
    }

    public static void method1() {
        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            if (ge == wan && shi == qian) {
                System.out.println(i);
            }
        }
    }

    public static void method2() {
        for (int i = 10000; i < 100000; i++) {
            String str = String.valueOf(i);
            String rev = new StringBuilder(str).reverse().toString();
            if (str.equals(rev)) {
                System.out.println(i);
            }
        }
    }

    public static void method3() {
        // 1. IntStream.range(10000, 99999)生成 10000-99999 所有数生成
        // 2. filter 0~开始   式样1-5 String0~4  2-4 String(1~3)
        // filter(i -> String.valueOf(i).charAt(0) == String.valueOf(i).charAt(4)
        // && String.valueOf(i).charAt(1) == String.valueOf(i).charAt(3)
        // 3. forEach() -> filter之后的数
        // 流式处理  -> 「web 背压」
        IntStream.range(10000, 99999).filter(i -> String.valueOf(i).charAt(0) == String.valueOf(i).charAt(4)
                        && String.valueOf(i).charAt(1) == String.valueOf(i).charAt(3)).
                forEach(i -> System.out.println(i));
    }
}
