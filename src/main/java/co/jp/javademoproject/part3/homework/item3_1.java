package co.jp.javademoproject.part3.homework;

public class item3_1 {
    public static void main(String[] args) {
        String [] array = {"A", "B"};

        // ネスティングロープ
        // 规则:外层执行一次  内层执行N次
        // 一回目：a -> A
        //        b -> A 、 B
        // 二回目：a- > B
        //        b -> A 、 B
        for(String a: array) {
            for(String b :array) {

                // 注意！！{}なし、if文範囲はbreakまで
                if("B".equals(b))
                    break;
                System.out.println(b);
            }
        }
    }
}
