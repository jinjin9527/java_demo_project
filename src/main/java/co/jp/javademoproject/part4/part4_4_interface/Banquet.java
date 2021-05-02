package co.jp.javademoproject.part4.part4_4_interface;

public class Banquet {
    public static void main(String[] args) throws Exception {
        // 1.想吃中餐
        Class supplyFoodClass = Class.forName("co.jp.javademoproject.part4.part4_4_interface.ChineseFood");
        Object obj = supplyFoodClass.getConstructor().newInstance();
        ((SupplyFood) obj).supplyFood();

        // 2.又想换成西餐
        // Class supplyFoodClass = Class.forName("co.jp.javademoproject.part4.part4_4_interface.WesternFood");

        // 3.又想换成法料
        // 这时候需要写法料的Class
        // 宴会Banquet class仍然需要改动代码
        // 但是这个时候只要关注 传递的类路径是否正确即可
    }
}
