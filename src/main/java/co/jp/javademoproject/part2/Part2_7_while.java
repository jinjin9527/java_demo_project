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
        int total = 0;// 13 12 11
        int count = 1;
        String fileName = "XXX";//XXX1  - XXX1000
        while(count <= 1000) {
            total += s;
            s--;
            String fileIndexName = fileName + count;
            // 根据fileIndexName 读取文件
            count++;

        }

        // 一定要注意 循环条件 避免造成无限循环 while(True){}
        System.out.println("finally s=" + s);
        System.out.println("total=" + total);
        System.out.println("End");
        scanner.close();


    }
}
