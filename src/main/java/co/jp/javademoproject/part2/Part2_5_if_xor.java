package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_5_if_xor {
    public static void main(String[] args) {

        // 訓練 IFでXORを実現する 入力「A B」値「0 1」
        // Scanner はコマンドラインから入力するAPI
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください：");

        // 入力した数値をsに付与する
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(xor(a, b));
        System.out.println("End");
        scanner.close();
    }

    public static int xor(int a, int b) {
        if (a == 1 && b==1 || a==0 && b==0) {
            return 0;
        } else {
            return 1;
        }
    }
}
