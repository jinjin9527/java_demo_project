package co.jp.javademoproject.part4.part4_1_class;

public abstract class Car {
    // 价格
    protected int price;

    // 荷载人数
    protected int seat;

    // 动力
    protected int power;

    // 底盘
    protected int chassis;

    public Car(int price, int seat, int power, int chassis) {
        this.price = price;
        this.seat = seat;
        this.power = power;
        this.chassis = chassis;
    }

    public String getInfo() {
        return "Car Type : " + getClass().getSimpleName() + " {" +
                "price=" + price +
                ", seat=" + seat +
                ", power=" + power +
                ", chassis=" + chassis +
                '}';
    }
}
