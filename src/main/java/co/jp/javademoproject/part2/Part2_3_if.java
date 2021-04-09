package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_3_if {
    public static void main(String[] args) {
        // Scanner はコマンドラインから入力するAPI
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力してください：");

        // 入力した数値をsに付与する
        int s = scanner.nextInt();

        if (s == 1) {
            System.out.println("INPUT：" + s + " == 1");
        } else if (s == 2) {
            System.out.println("INPUT：" + s + " == 2");
        } else if (s >= 9) {
            System.out.println("INPUT：" + s + " >= 9");
        } else {
            System.out.println("INPUT：" + s + " not equals all condition");
            System.out.println("INPUT：" + s + " range?");
        }
        System.out.println("End");
        scanner.close();
    }
}
