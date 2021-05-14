package co.jp.javademoproject.part5.homework.item5_6;

import java.util.Arrays;

public class Item56 {
    public static void main(String[] args) {

        // 深copy copy对象与原先的对象互不干扰
        // 数组拷贝  把 拷贝先改了 拷贝元会被影响么？
        int [] a = {1, 2 ,3};
        int [] b = a.clone();
        b[0]=100;
//        System.out.println("a[0] : " + a[0]);
//        System.out.println("b[0] : " + b[0]);

        // 浅copy
        int [] c = {1, 2 ,3};
        int [] d = c;
        c[0]=100;
//        System.out.println("c[0] : "+ c[0]);
//        System.out.println("d[0] : "+ d[0]);

        // 但是2维以上的话，clone会变成浅copy 2维以上想实现深copy的话， 途径1 依次对N-1维调用clone 途径2 调用其他api
        int [][] aa = {{1, 2 ,3}, {4,5,6}};
        int [][] bb = aa.clone();
        aa[0][0]=100;
        System.out.println(bb[0][0]);
    }
}
