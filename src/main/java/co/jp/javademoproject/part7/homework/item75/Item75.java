package co.jp.javademoproject.part7.homework.item75;

public class Item75 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getValue());
    }
}


class A {
    int num = 10;
    public double getValue(){
        return 0.0;
    }
}
class B extends A {
    public double getValue(){
        return 1.0;
    }
}

class C extends B{
    public double getValue(){
        System.out.println(super.num);
        return super.getValue();
    }
}