package co.jp.javademoproject.part4.part4_4_interface;

public class Banquet {
    public static void main(String[] args) throws Exception {
        // 1.想吃中餐
        // 可以用完全路径的类名来 实例化 接口 类型
        // 用Class.forName 获得了他的类型
        Class supplyFoodClass = Class.forName("co.jp.javademoproject.part4.part4_4_interface.WesternFood");
        // supplyFoodClass.getConstructor() 获得构造方法
        // 有构造方法获得实例 getConstructor().newInstance()
        Object obj = supplyFoodClass.getConstructor().newInstance();
        // ChineseFood chineseFood = new ChineseFood();
        ((SupplyFood) obj).supplyFood();

        // 2.又想换成西餐
        // Class supplyFoodClass = Class.forName("co.jp.javademoproject.part4.part4_4_interface.WesternFood");

        // 3.又想换成法料
        // 这时候需要写法料的Class
        // 宴会Banquet class仍然需要改动代码
        // 但是这个时候只要关注 传递的类路径是否正确即可
    }
}
