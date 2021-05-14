package co.jp.javademoproject.part5.homework.item5_5;

public class Child extends Parent {
    String name;
    // 1.关于继承的解释
    // 虽然Child能够继承 Parent 的 getName方法
    // 但是Child声明了 自己的name  也就是说 Child和Parent 各自有各自的name属性

    // 2.执行时的解释
    // child.getName 实际上是调用了继承自Parent的getName方法
    // 而Parent的getName方法 用 this指向了自己的name
    // 因此 就算给child的name赋值  通过child实例调用getName方法时 得到的是parent的name 他是null
}

// 父类跟子类有相同的 属性的时候 很容易让人分不清作用域

// 重载 重写

class Parent {
    String name;
    String getName(){
        return name;
    }
}
