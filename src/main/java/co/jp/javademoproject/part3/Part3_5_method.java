package co.jp.javademoproject.part3;

public class Part3_5_method {

    // 6.递归「再帰」
    // 递归就是：A方法调用A方法！就是自己调用自己。
    // 因此我们在设计递归算法时，一定要指明什么时候自己不调用自己。否则，就是个死循环！
    // 递归是一种常见的解决问题的方法，即把问题逐渐简单化。递归的基本思想就是“自己调用自己”，一个
    // 使用递归技术的方法将会直接或者间接的调用自己。
    // 利用递归可以用简单的程序来解决一些复杂的问题。它通常把一个大型复杂的问题层层转化为一个与原
    // 问题相似的规模较小的问题来求解，递归策略只需少量的程序就可描述出解题过程所需要的多次重复计
    // 算，大大地减少了程序的代码量。递归的能力在于用有限的语句来定义对象的无限集合。

    // 递归结构包括两个部分：for(;boolean;)  while(boolean)
    // 1. 递归头。解答：什么时候不调用自身方法。如果没有头，将陷入死循环。
    // 2. 递归体。解答：什么时候需要调用自身方法。

    public static void main(String[] args) {

        // n!
        // 5! -> 5 * 4 * 3 * 2 * 1
        // f(5) ↓
        // 一回目：5 != 1  -> 5 * f(4)
        // 5 * f(4) ↓
        // 二回目：4 != 1  -> 4 * f(3)
        // 5 * 4 * f(3) ↓
        // 三回目：3 != 1  -> 3 * f(2)
        // 5 * 4 * 3 * f(2) ↓
        // 四回目：2 != 1  -> 2 * f(1)
        // 5 * 4 * 3 * 2 * f(1)
        // 五回目：1 == 1  -> 1
        int total = 1;
        int n = 5;
        while(n >=1) {
            total = total * n;
            n--;
        }
        System.out.println(total);

//        System.out.println(f(10));
    }

    public static int f(int n) {
        if (1 == n)
            return 1;
        // 递归头部
        else
            return n * f(n - 1);
    }
}
