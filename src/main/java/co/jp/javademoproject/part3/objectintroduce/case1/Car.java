package co.jp.javademoproject.part3.objectintroduce.case1;

// public 公共 你在任何地方  都可以访问到
// private 私有 你在除了他自己以外的地方 都访问不到
// 访问控制修饰符
// protected class
public class Car {
    private int price;
    private int seat;

    public Car(int price, int seat) {
        this.price = price;
        this.seat = seat;
    }

    public String getInfo() {
        return "price : " + (price + 50) + " seat : " + seat;
    }
}
