package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_4_if {
    public static void main(String[] args) {

        // 訓練 IFでXORを実現する 入力「A B」値「0 1」
        // OR    A   B   Result
        //       T   T   T
        //       T   F   T
        //       F   T   T
        //       F   F   F

        // XOR = (¬a ∧ b) ∨ (a ∧¬b)
        // XOR   A   B   Result
        //       T   T   F
        //       T   F   T
        //       F   T   T
        //       F   F   F
        // Scanner はコマンドラインから入力するAPI
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください：");

        // 入力した数値をsに付与する
        int s = scanner.nextInt();

        // 血压 120
        // 110
        if (s > 1) {
            System.out.println("INPUT：" + s + " > 1");
            if (s > 100) {
                System.out.println("INPUT：" + s + " > 100");
            }
        } else {
            // s < 1
            System.out.println("INPUT：" + s + " <= 0");
            if (s < -100) {
                System.out.println("INPUT：" + s + " < -100");
            }
        }
        System.out.println("End");
        scanner.close();
    }
}
