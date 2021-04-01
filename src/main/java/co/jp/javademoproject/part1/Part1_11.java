package co.jp.javademoproject.part1;

public class Part1_11 {

    public static void main(String[] args) {
        int x = 1;
        int y = x++;
        System.out.println("yは" + y);   // 結果：yは1
        int a = 1;
        int b = ++a;
        System.out.println("bは" + b);   // 結果：bは2

        if (++a + a++ + 1 == 4) {
            System.out.println("aaa : " + a);
        } else {
            System.out.println("bbb : " + a);
        }
    }
}

