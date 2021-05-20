package co.jp.javademoproject.part6.item66.method1;

import co.jp.javademoproject.part6.item66.SupplyFood;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Banquet {
    public static void main(String[] args) throws Exception {
        List<String> contentList = Files.readAllLines(Paths.get("./" + args[0]));
        for(String index : contentList) {
            Class supplyFoodClass = Class.forName(index);
            Object obj = supplyFoodClass.getConstructor().newInstance();
            ((SupplyFood) obj).supplyFood();
        }
    }
}
