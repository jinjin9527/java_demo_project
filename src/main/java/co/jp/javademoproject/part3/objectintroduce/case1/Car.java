package co.jp.javademoproject.part3.objectintroduce.case1;

public class Car {
    private int price;
    private int seat;

    public Car(int price, int seat) {
        this.price = price;
        this.seat = seat;
    }

    public String getInfo() {
        return "price : " + price + " seat : " + seat;
    }
}
