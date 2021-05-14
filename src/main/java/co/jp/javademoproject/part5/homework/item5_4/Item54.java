package co.jp.javademoproject.part5.homework.item5_4;

public class Item54 {
    public static void main(String[] args) {
        Sample s = new Sample(10);
        System.out.println(s.getNum());
    }
}



class Sample{
    private int num;
    private String aaa;
    public Sample(int num){
        // this关键字是指自己
        // super 关键字指自己的父类
        // 重名的情况下 变量作用域 有效范围！

//        this.num = num;
        // super关键字是指父类，Sample没有任何继承关系 所以 编译错误
//        super.setNum(num);
        // this关键字是指自己 如果没有this  则其实等于参数列表的num 自己赋值自己 没什么实际作用
        num = num;
        // 变量作用域 重名的情况下 有效范围！
        // setNum方法是正确的赋值方式
//        setNum(num);
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
}

