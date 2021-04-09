package co.jp.javademoproject.part2;

public class Part2_10_for {
    public static void main(String[] args) {
        // 規則： for(初期化;条件「boolean」;更新){...}
        // 訓練 1...100 の合算値は？
        int total = 0;
        int i = 1;
        for (;i <= 100;) {
            total += i;
            i++;
        }

        System.out.println("finally i=" + i);
        System.out.println("total=" + total);
        System.out.println("End");
        // ↓ はどうなる？
//        for(;;){
//        }
    }
}
