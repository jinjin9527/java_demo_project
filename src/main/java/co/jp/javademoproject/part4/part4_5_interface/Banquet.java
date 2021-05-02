package co.jp.javademoproject.part4.part4_5_interface;

public class Banquet {
    public static void main(String[] args) throws Exception {
        System.out.println("args : " + args[0]);
        // 1.想吃中餐
        Class supplyFoodClass = Class.forName(args[0]);
        Object obj = supplyFoodClass.getConstructor().newInstance();
        ((SupplyFood) obj).supplyFood();

        // 2.又想换成西餐
        // 只需要在执行时传入正确的 西餐类路径

        // 3.又想换成法料
        // 这时候需要写法料的Class
        // 而宴会Banquet class 不需要改动任何代码！！！

        // 这种方式叫做反射
        // Spring IOC的核心实现方式
    }
}