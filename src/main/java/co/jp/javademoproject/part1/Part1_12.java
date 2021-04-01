package co.jp.javademoproject.part1;

public class Part1_12 {

    public static void main(String[] args) {
        int a1 = 3 ^ 2;
        System.out.println(a1);
        double b1 = Math.pow(3, 2);
        System.out.println(b1);

        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));

        System.out.println(2 << 3);

        // A =     0011 1100;
        // B =     0000 1101;
        // A & B = 0000 1100
        // A | B = 0011 1101
        // A ^ B = 0011 0001
        // ~A =    1100 0011

        int score = 80;
        String type = score < 60 ? "a" : "b";
        System.out.println("type= " + type);

    }
}

