package co.jp.javademoproject.part4.part4_6_exception;

public class ExceptionIntro2 {
    public static void main(String[] args) {

        // 数学上的异常 除0操作
        try {
            int a = 1 / 0;
        } catch (ArithmeticException ae) {
            // ae.printStackTrace();
        }
        int b = 10;
        System.out.println("b : " + b);
    }
}
