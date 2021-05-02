package co.jp.javademoproject.part3;

public class Part3_9_array {

    public static void main(String[] args) {

        // 6.多维数组
        // 多维数组可以看成是数组的数组，
        // 比如二维数组就是一个特殊的一维数组，其每一个元素都是一个一维数组。
        // type[][] typeName = new type[typeLength1][typeLength2];
        int a[][] = new int[2][5];
        int b[][] = {{1, 2}, {3, 4, 5}};

//        printArray(b);
        // 注意1： 定义时 只需要指定n-1维的数即可
        int c[][] = new int[2][];
        c[0] =new int[]{1, 2, 3};
        // 注意2： 使用之前需要初始化 以及 下标越界
//        c[1] = new int [2];
//        c[1][0] = 10;
    }

//    public static void sdsff(){
//        //sdasdfasd
//        for(int []j : i){
//            // safdadfasff
//            for(int k :j) {
//                // adasdf
//
//            }
//        }
//    }
//
//    public static void printArray(int[][][] args) {
//        // 用循环嵌套 或者数组维数 2
//        for(int [][]i : args) {
//
//
//        }
//        for(int []i : args) {
//            for(int j :i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }

}
