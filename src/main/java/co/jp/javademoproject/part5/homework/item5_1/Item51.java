package co.jp.javademoproject.part5.homework.item5_1;

public class Item51 {
    public static void main(String[] args) {
        A[] array = {
                new B(),
                new C(),
                // new A() 编译错误 原因是接口不能被实例化new
//                new A(),
                // new D() 编译错误 原因是D跟A没啥关系
//                new D()
                // 只有子类的实例 可以被声明为父类对象
        };
        B b = new B();
//        A a = new A();
    }
}
