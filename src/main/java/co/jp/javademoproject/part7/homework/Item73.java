package co.jp.javademoproject.part7.homework;

public class Item73 {
    public static void main(String[] args) {
        A a = new B();
//        a.bye();
    }
}

class A {
    public void hello(){
        System.out.println("hello");
    }
}

class B extends A {
    public void bye(){
        System.out.println("bye");
    }
}