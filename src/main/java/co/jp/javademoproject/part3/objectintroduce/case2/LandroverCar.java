package co.jp.javademoproject.part3.objectintroduce.case2;

// 路虎
public class LandroverCar extends SpecialCar implements RunOnRoad{

    private static final String CAR_TYPE = "Landrover";

    // 默认构造
    public LandroverCar() {
        super(400, 4, 200, 50);
    }

    // 有参构造
    public LandroverCar(int price, int seat, int power, int chassis) {
        super(price, seat, power, chassis);
    }

    @Override
    public boolean canRunOnMountRoad() {
        // 因为是路虎 默认 能开 山路
        return true;
    }

    @Override
    public boolean canRunOnExpressway() {
        // 路虎车辆 动力超过150匹马力 才能开高速
        return power >= 150;
    }

    @Override
    protected String getCarType() {
        // 车辆种类是路虎 Landrover
        return CAR_TYPE;
    }
}
