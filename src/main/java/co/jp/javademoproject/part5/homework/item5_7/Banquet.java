package co.jp.javademoproject.part5.homework.item5_7;

import java.io.File;
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
