package co.jp.javademoproject.part3.objectintroduce.case2;

public abstract class SpecialCar {
    // 价格
    protected int price;

    // 荷载人数
    protected int seat;

    // 动力
    protected int power;

    // 底盘
    protected int chassis;

    public SpecialCar(int price, int seat, int power, int chassis) {
        this.price = price;
        this.seat = seat;
        this.power = power;
        this.chassis = chassis;
    }

    // 获得车辆种类
    protected abstract String getCarType();

    public String getInfo() {
        return "Car Type : " + getCarType() + " {" +
                "price=" + price +
                ", seat=" + seat +
                ", power=" + power +
                ", chassis=" + chassis +
                '}';
    }
}
