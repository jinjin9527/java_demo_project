package co.jp.javademoproject.part3.objectintroduce.case2;

// 保时捷
public class PorscheCar extends SpecialCar implements RunOnRoad{

    private static final String CAR_TYPE = "Porsche";

    // 默认构造
    public PorscheCar() {
        super(300, 2, 300, 10);
    }

    // 有参构造
    public PorscheCar(int price, int seat, int power, int chassis) {
        super(price, seat, power, chassis);
    }

    @Override
    public boolean canRunOnMountRoad() {
        // 保时捷 底盘超过 20 的车种才能开山路
        return chassis > 20;
    }

    @Override
    public boolean canRunOnExpressway() {
        // 因为是保时捷 默认 能开高速
        return true;
    }

    @Override
    protected String getCarType() {
        return CAR_TYPE;
    }
}
