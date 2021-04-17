package co.jp.javademoproject.part3.homework;

public class Item3_6 {
    // 重複しない3桁数値の組み合わせ」。
    // 入力数値：「1、2、3、4」。
    // 出力例：「123」「421」。
    // 注意点：重複しないこと、3桁であること。
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 4; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(i * 100 + j * 10 + k);
                    }
                }
            }
        }
    }
}
