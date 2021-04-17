package co.jp.javademoproject.part3;

public class Part3_8_array {

    public static void main(String[] args) {

        // 5.数组的运用
        // 注意点
        // 数组作为方法参数传递时 是地址传递
        int[] a = {1, 2, 3};
        System.out.println("a 初始化：");
        printArray(a);
        updateArray(a);
        System.out.println("a 变更后：");
        printArray(a);

        // 而基本类型作为方法参数传递时 是值传递
        int b = 10;
        System.out.println("b 初始化：" + b);
        updateNum(b);
        System.out.println("b '变更后'：" + b);

    }

    public static void updateNum(int b) {
        b = 100;
    }

    public static void updateArray(int []array) {
        array[0] = 5;
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
