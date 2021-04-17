package co.jp.javademoproject.part3;

import co.jp.javademoproject.part3.objectintroduce.case1.Car;
import co.jp.javademoproject.part3.objectintroduce.case2.LandroverCar;
import co.jp.javademoproject.part3.objectintroduce.case2.PorscheCar;
import co.jp.javademoproject.part3.objectintroduce.case2.RunOnRoad;
import co.jp.javademoproject.part3.objectintroduce.case2.SpecialCar;

public class Part3_12_object {

    public static void main(String[] args) {

        // 1.什么是对象
        // 面向对象编程的本质就是：以类的方式组织代码，以对象的组织(封装)数据。

        // 概念介绍3.(继承　inheritance)：
        // 继承是一种联结类的层次模型，并且允许和支持类的重用，它提供了一种明确表述共性的方法。
        // 新类继承了原始类后,新类就继承了原始类的特性，新类称为原始类的派生类(子类)，而原始类称为新类的基类(父类)。
        // 派生类(子类)可以从它的基类(父类)那里继承方法和实例变量，
        // 并且派生类(子类)中可以修改或增加新的方法使之更适合特殊的需要继承性很好的解决了软件的可重用性问题。

        // 概念介绍4.(多态　polymorphism)：
        // 多态性是指允许不同类的对象对同一消息作出响应。
        // 多态性语言具有灵活、抽象、行为共享、代码共享的优势，很好的解决了应用程序函数同名问题。
        // 相同类域的不同对象,调用相同方法,表现出不同的结果

        RunOnRoad []carArray = {new LandroverCar(), new PorscheCar()};
        for (RunOnRoad index : carArray){
            System.out.println(index.canRunOnMountRoad());
        }
        for (RunOnRoad index : carArray){
            System.out.println(((SpecialCar)index).getInfo());
        }
    }
}
