package co.jp.javademoproject.part4.homework;

public class Item4_1 {
    public static void main(String[] args) {
        String[][] array = {{"A", "B"}, null, {"C", "D", "E"}};
        int total = 0;
        for (String[] tmp : array) {
            // 一回目 tmp = {"A", "B"}のため、lengthあり、2である。
            // 二回目 tmp = nullのため、lengthなし、実行時NullPointException発生
            total += tmp.length;
        }
        System.out.println(total);
    }
}
