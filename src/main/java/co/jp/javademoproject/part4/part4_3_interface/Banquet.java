package co.jp.javademoproject.part4.part4_3_interface;

public class Banquet {
    public static void main(String[] args) {

        // 1.想吃中餐
        SupplyFood supplyFood = new ChineseFood();
        supplyFood.supplyFood();

        // 2.又想换成西餐
        // SupplyFood supplyFood = new WesternFood();
        // supplyFood.supplyFood();


        // 3.又想换成法料
        // 这时候需要写法料的Class
        // 宴会Banquet class仍然需要改动代码
        // 但是这个时候只要关注 new的对象即可了
    }
}
