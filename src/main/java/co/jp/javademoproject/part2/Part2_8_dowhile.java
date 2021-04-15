package co.jp.javademoproject.part2;

import java.util.Scanner;

public class Part2_8_dowhile {
    public static void main(String[] args) {
        // Scanner はコマンドラインから入力するAPI
        // 訓練 1...100 の合算値は？

        // 規則： do {...} while(boolean[true])
        // 少なくとも1回実行する
        int total = 0;
        int count = -10;
         //int count = 100;
        do {
            total += count;
            count--;
        } while (count > 0);
        System.out.println("finally count=" + count);
        System.out.println("total=" + total);
        System.out.println("End");

        // では、whileとdowhileの区別！！
        // dowhile至少执行一次之后判断条件  while先判断条件
    }
}
