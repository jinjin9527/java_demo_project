package co.jp.javademoproject.part6.homework;

public class Item65 {
    public static void main(String[] args) {
        AbstractSample s = new ConcreteSample1();
        s.sample();
    }
}

abstract class AbstractSample {
    public void sample(){
        // 後からlog追加してください。
        // logの実装に囲まれて
        //
        System.out.println(" sample start");

        // 前の処理 start
        System.out.println("A");
        System.out.println(" test start");
        test();
        System.out.println(" test end");
        System.out.println("C");
        // 前の処理 end

        System.out.println("sample end");
    }
    protected abstract void test();
}

// AOP一个思想概念
// 中国食品
class ConcreteSample1 extends AbstractSample{
    protected void test() {
        // すでに実装する前に、お客さんと合意していなかった
//        System.out.println(" test start");
        System.out.println("B");
//        System.out.println(" test end");
    }
}

// フランス食品
class ConcreteSample2 extends AbstractSample{
    protected void test() {
        System.out.println("B");
    }
}
class ConcreteSample3 extends AbstractSample{
    protected void test() {
        System.out.println("B");
    }
}
