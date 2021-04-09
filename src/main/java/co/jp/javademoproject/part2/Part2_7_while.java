package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_7_while {
    public static void main(String[] args) {
        // Scanner はコマンドラインから入力するAPI
        // 訓練 1...100 の合算値は？
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力してください：");

        // 入力した数値をsに付与する
        int s = scanner.nextInt();

        //規則： while(boolean[true])
        int total = 0;
        while(s > 10) {
            total += s;
            s--;
        }
        System.out.println("finally s=" + s);
        System.out.println("total=" + total);
        System.out.println("End");
        scanner.close();


    }
}
