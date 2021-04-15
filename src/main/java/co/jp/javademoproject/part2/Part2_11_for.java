package co.jp.javademoproject.part2;

public class Part2_11_for {
    public static void main(String[] args) {
        // 規則： for(初期化;条件「boolean」;更新){...}
        int total = 0;

        for (int i = 1, j = 2, k=3; i <= 100; i++,j--,k++) {
            total += i * j;
        }
        // ↓ はどうなる？
        // for (int x=1, long y=2;x <= 100; x++,y--){
//          total += i * j;
//        }
        System.out.println("total=" + total);
        System.out.println("End");
        // 訓練1：1-100 奇数と偶数、それぞれの合算値を出力する
        // 訓練2：1-100 5の倍数を出力する。3個ごとに、改行を入れる！
        // 訓練3：掛け算公式のフォーマットを出力する 九九乘法表
    }
}
