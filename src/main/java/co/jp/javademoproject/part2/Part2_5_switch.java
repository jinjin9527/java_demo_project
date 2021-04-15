package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_5_switch {
    public static void main(String[] args) {
        // Scanner はコマンドラインから入力するAPI
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力してください：");

        // 入力した数値をsに付与する
        int s = scanner.nextInt();

        // 規則：
        // switch(X) { case Y1 : ... case Y2: ...  case YN: ... default}
        // X は byte int long short char or String
        // 1  2 3   'c'  "123123Saafafa"
        // マッチしたcaseから実行する！！
        switch (s) {
            case 100:
                System.out.println("case 100");
                System.out.println("excellent");
                break;
            case 90:
                System.out.println("case 90");
            case 80:
                System.out.println("case 80");
                System.out.println("s == 90 or s == 80");
                System.out.println("good");
                break;
            case 70:
                System.out.println("case 70");
            case 60:
                System.out.println("case 60");
                System.out.println("s == 70 or s == 60");
                System.out.println("normal");
                break;
            default:
                System.out.println("fail");
        }
        System.out.println("End");
        scanner.close();
    }
}
