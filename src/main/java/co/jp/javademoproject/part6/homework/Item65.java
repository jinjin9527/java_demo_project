package co.jp.javademoproject.part6.homework;

public class Item65 {
    public static void main(String[] args) {
        AbstractSample s = new ConcreteSample();
        s.sample();
    }
}

abstract  class AbstractSample{
    public void sample(){
        System.out.println("A");
        test();
        System.out.println("C");
    }
    protected abstract void test();
}
class ConcreteSample extends AbstractSample{
    protected void test() {
        System.out.println("B");
    }
}
