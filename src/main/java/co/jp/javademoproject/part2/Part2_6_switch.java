package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_6_switch {
    public static void main(String[] args) {
        // Scanner はコマンドラインから入力するAPI
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください：");

        // 入力した文字列をsに付与する
        String s = scanner.nextLine();

        // 規則：
        // switch(X) { case Y1 : ... case Y2: ...  case YN: ... default}
        // X は byte int long short char or String
        // マッチしたcaseから実行する！！
        switch (s) {
            case "A":
                System.out.println("case A");
                System.out.println("excellent");

            case "B":
                System.out.println("case B");
            case "C":
                System.out.println("case C");
                System.out.println("s == B or s == C");
                System.out.println("good");
                break;
            case "D":
                System.out.println("case D");
            case "E":
                System.out.println("case E");
                System.out.println("s == D or s == E");
                System.out.println("normal");
                break;
            default:
                System.out.println("fail");
        }
        System.out.println("End");
        scanner.close();

        // switch 注意点：
        // ・switch(X)  Xの型に制限あり
        // case -- break;   breakがないと、次のcaseにもマッチ！！
        // if と比べて、どんな感じ？
    }
}
