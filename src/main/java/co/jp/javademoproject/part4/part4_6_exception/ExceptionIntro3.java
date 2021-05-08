package co.jp.javademoproject.part4.part4_6_exception;

public class ExceptionIntro3 {
    public static void main(String[] args) {

        // 异常机制
        // try {
        //    有可能发生异常的处理
        // } catch(XXXException) {
        //    当异常发生时需要做的操作「比如记录 记录log」
        // } finally {
        //    无论异常是否发生都会执行的操作「比如 清空存储空间 释放数据库链接链接 等」
        // }
        String a = "";
        try {
            a += 1/1;
        } catch (ArithmeticException ae) {
            // ae.printStackTrace();
            a = "-1";
        } finally {
            System.out.println("执行了finally");
        }
        int b = 10;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
