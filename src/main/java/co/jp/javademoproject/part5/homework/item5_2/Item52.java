package co.jp.javademoproject.part5.homework.item5_2;

public class Item52 {
    public static void main(String[] args) {

        // 子类可以顺利的赋值给父类
        // 父类赋值给子类 需要强制转换
        // 想一想 基础类型的转换 int 自动-> long   long 强制-> int
        // 面向对象世界里 子类比父类要细致 所以 父类到子类需要类型转换
        // 映射到自然世界里 可以说 跑车是一辆车 但反过来 车是一辆跑车就不太顺畅
        A a = new B();
        B b = (B) a;
        b.hello();
    }
}

class A{}
class B extends A{
    void hello() {
        System.out.println("hello");
    }
}
