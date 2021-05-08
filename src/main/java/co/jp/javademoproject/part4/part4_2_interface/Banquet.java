package co.jp.javademoproject.part4.part4_2_interface;

import co.jp.javademoproject.part4.part4_4_interface.SupplyFood;

public class Banquet {
    public static void main(String[] args) throws Exception {

        // 1.想吃中餐
        ChineseFood chineseFood = new ChineseFood();
        chineseFood.supplyFood();

        // 2.又想换成西餐
        WesternFood westernFood = new WesternFood();
        westernFood.supplyFood();

        FrenchFood frenchFood = new FrenchFood();
        frenchFood.supplyFood();

        Class supplyFoodClass = Class.forName("co.jp.javademoproject.part4.part4_2_interface.ChineseFood");
        // supplyFoodClass.getConstructor() 获得构造方法
        // 有构造方法获得实例 getConstructor().newInstance()
        Object obj = supplyFoodClass.getConstructor().newInstance();
        ((ChineseFood) obj).supplyFood();
        // 3.又想换成法料
        // 这时候需要写法料的Class
        // 宴会Banquet class还是需要改动代码
        // 这样就是 宴会和各种料理品种 形成了 强结合
    }
}
