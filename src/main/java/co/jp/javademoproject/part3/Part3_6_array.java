package co.jp.javademoproject.part3;

public class Part3_6_array {

    // 1.数组的定义
    // 数组是相同类型数据的有序集合.
    // 数组描述的是相同类型的若干个数据,按照一定的先后次序排列组合而成。
    // 其中,每一个数据称作一个数组元素,每个数组元素可以通过一个下标来访问它们.

    // 2.数组的特点
    // 其长度是确定的。数组一旦被创建，它的大小就是不可以改变的。
    // 其元素必须是相同类型,不允许出现混合类型。
    // 数组中的元素可以是任何数据类型，包括基本类型和引用类型。
    // 数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量

    // 3.数组的声明
    // dataType[] arrayRefVar;
    // dataType arrayRefVar[];
    // 例：arrayRefVar = new dataType[arraySize];

    // 上面的语法语句做了两件事：
    // 一、使用 dataType[arraySize] 创建了一个数组。
    // 二、把新创建的数组的引用赋值给变量 arrayRefVar。

    // 数组的元素是通过索引访问的。数组索引从 0 开始，所以索引值从 0 到 arrayRefVar.length-1
    // arrays.length
    public static void main(String[] args) {

        //1.声明一个数组
        int[] myList = null;
        //2.创建一个数组
        myList = new int[10]; //3.像数组中存值
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        myList[4] = 5;
        myList[5] = 6;
        myList[6] = 7;
        myList[7] = 8;
        myList[8] = 9;
        myList[9] = 10;
        // 计算所有元素的总和

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
//        System.out.println("总和为： " + total);
        System.out.println(myList[myList.length - 1]);

    }

}
