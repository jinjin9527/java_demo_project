package co.jp.javademoproject.part4.part4_1_class;

public class Part4_1_Abstract {
    public static void main(String[] args) {
//        Car car1 = new Bus();
//        Car car2 = new SportsCar();
        //        System.out.println(car1.getInfo());
//        System.out.println(car2.getInfo());
        Bus car1 = new Bus();
        SportsCar car2 = new SportsCar();

        Car aa [] = {new Bus(), new SportsCar()};

        for (Car bbb : aa) {
            System.out.println(bbb.getInfo());
        }


    }
}
