package co.jp.javademoproject.part1;

public class Part1_2 {
    public static void main(String[] args) {

        // 二進数 JRE7から
        int a = 0b0101;

        // int
        int i1=100;

        // long
        long i2=998877665544332211L;

        // short
        short i3=235;

        // double
        double d1=3.5;
        double d2=3;

        // float
        float f1=(float)3.5;
        float f2=3.5f;
        // error default doulbe
//        float f3=3.5;

        // boolean
        boolean isPass=true;
        boolean isOk=false;
        boolean isBig=5>8;

        if(isBig){
            System.out.println("isBig");
        }else{
            System.out.println("is not Big");
        }
        // char
        char f='女';
        char m='男';
    }
}

