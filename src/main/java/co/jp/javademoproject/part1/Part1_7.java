package co.jp.javademoproject.part1;

public class Part1_7 {
    static int allClicks = 0; // クラス変数
    String str = "hello world"; // インスタンス変数

    public void method() {
        int i = 0; // local
    }

    public static void main(String[] args) {
        Part1_7 obj1 = new Part1_7();
        Part1_7 obj2 = new Part1_7();

        obj1.allClicks = 6;
        System.out.println("obj2.allClicks : " + obj2.allClicks);
        obj1.str = "123";
        System.out.println("obj2.str: " + obj2.str);
    }
}

