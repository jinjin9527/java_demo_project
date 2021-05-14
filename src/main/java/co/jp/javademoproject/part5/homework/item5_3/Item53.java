package co.jp.javademoproject.part5.homework.item5_3;

public class Item53 {
    public static void main(String[] args) {
        // a 是A的实例
        A a = new A();
        // 编码的时候 你可以把它强制类型转换到B
        // 但是执行的时候 会因为类型不对称 报ClassCastException错误

        // 父类 -> 子类  需要强制类型转换
        A a1 = new B();
        B b1= (B) a1;

        A a2 = new A();
        // 保存的是A的实例
        B b = (B) a2;

//        B b = (B) a;
//        b.hello();
    }
}

class A{
    void hello(){
        System.out.println("A");
    }
}
class B extends A{
    void hello(){
        System.out.println("B");
    }
}
