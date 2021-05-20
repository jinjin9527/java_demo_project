package co.jp.javademoproject.part4.part4_5_interface;

public class Banquet {
    public static void main(String[] args) throws Exception {
        // util use認証を行う
        // 参数变更即可
        // 配置文件[spring]  @注解配置
        // 接口 和 虚基类
        System.out.println("args : " + args[0]);
        // 1.想吃中餐
        // 关注点变了   接口不关心 谁来提供服务  只关心 提供了什么样的服务
        for(String index : args) {
            Class supplyFoodClass = Class.forName(index);
            Object obj = supplyFoodClass.getConstructor().newInstance();
            System.out.println("start supplyFood");
            ((SupplyFood) obj).supplyFood();
            System.out.println("end supplyFood");
        }

        // 2.又想换成西餐
        // 只需要在执行时传入正确的 西餐类路径

        // 3.又想换成法料
        // 这时候需要写法料的Class
        // 而宴会Banquet class 不需要改动任何代码！！！

        // 这种方式叫做反射
        // Spring IOC的核心实现方式
    }
}
