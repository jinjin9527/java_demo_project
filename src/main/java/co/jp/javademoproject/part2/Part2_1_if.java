package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_1_if {
    public static void main(String[] args) {
        // Scanner はコマンドラインから入力するAPI
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください：");

        // 入力した文字列をsに付与する
        String s = scanner.nextLine();

        // equals は 比較関数
        // 規則 if (boolean)
        // hello
        if (s.equals("Hello")) {
            System.out.println("INPUT：" + s + " equals if condition 「Hello」");
        }
        System.out.println("End");
        scanner.close();
    }
}
