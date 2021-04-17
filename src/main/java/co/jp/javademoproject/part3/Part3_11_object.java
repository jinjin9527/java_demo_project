package co.jp.javademoproject.part3;

import co.jp.javademoproject.part3.objectintroduce.case1.Car;
import co.jp.javademoproject.part3.objectintroduce.case2.LandroverCar;

public class Part3_11_object {

    public static void main(String[] args) {

        // 1.什么是对象
        // 面向对象编程的本质就是：以类的方式组织代码，以对象的组织(封装)数据。

        // 概念介绍1.(抽象　abstract)：
        // 忽略一个主题中与当前目标无关的那些方面，以便更充分地注意与当前目标有关的方面。
        // 抽象并不打算了 解全部问题，而只是选择其中的一部分，暂时不用关注细节。
        // 例1:要设计一个学生成绩管理系统，那么对于学生，只关心他的班级、学号、成绩等，而不用去关心他的 身高、体重这些信息。
        // 列2:要设计一个简单的车辆管理系统。那么对于奔驰，保时捷，宝马等众多制造商。只关注车辆的价格，时速。而不关心他的发动机型号，荷载人数。

        // 抽象的本质：就是根据需求要件。将多个物体共同点归纳出来，就是抽出像的部分！

        // 概念介绍2.(封装　Encapsulation)：
        // 封装是面向对象的特征之一，是对象和类概念的主要特性。
        // 封装是把过程和数据包围起来，对数据的访问只能通过指定的方式。
        // package : case1
        Car normalCar = new Car(100, 4);
        System.out.println(normalCar.getInfo());

        // 在定义一个对象的特性的时候，有必要决定这些特性的可见性，
        // 即哪些特性对外部是可见的，哪些特性用于表示内部状态。
        // 通常，应禁止直接访问一个对象中数据的实际表示，而应通过操作接口来访问，这称为信息隐藏。
        // package : case2
        LandroverCar specialCarLandrover = new LandroverCar();
        System.out.println("Landrover can run on expressway ? " + specialCarLandrover.canRunOnExpressway());
        System.out.println("Landrover can run on mountRoad ? " + specialCarLandrover.canRunOnMountRoad());

        // 信息隐藏是用户对封装性的认识，封装则为信息隐藏提供支持。
        // 封装保证了模块具有较好的独立性，使得程序维护修改较为容易。
        // 对应用程序的修改仅限于类的内部，因而可以将应用程序修改带来的影响减少到最低限度。
    }

}
