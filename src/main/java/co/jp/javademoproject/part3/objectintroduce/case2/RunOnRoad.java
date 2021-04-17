package co.jp.javademoproject.part3.objectintroduce.case2;

// 一个抽象出来个概念 能不能跑各种路段
public interface RunOnRoad {

    // 能不能跑山路
    boolean canRunOnMountRoad();
    // 能不能跑高速
    boolean canRunOnExpressway();
}
