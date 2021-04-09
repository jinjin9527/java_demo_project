package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_9_for {
    public static void main(String[] args) {
        // 規則： for(初期化;条件「boolean」;更新){...}
        // 詳細流れ：
        // ステップ1：「初期化」を実行
        // ステップ2：「条件」判断を実行
        // ステップ3-1：「条件」trueの場合{...}を一回実行
        // ステップ3-2：「条件」falseの場合{...}を実行しない、for終了
        // ステップ4：「更新」を実行
        // ステップ5：ステップ2から繰り返す

        // 訓練 1...100 の合算値は？
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        // ↓ どうなる？
        // System.out.println("finally i=" + i);
        System.out.println("total=" + total);
        System.out.println("End");
    }
}
