package co.jp.javademoproject.part6.item66.method1;

import java.util.ArrayList;
import java.util.List;

public class FrenchFood extends BaseFood {
    @Override
    public List<String> getFoodList() {
        List<String> foodList = new ArrayList<>();
        foodList.add("wine66_1");
        foodList.add("beef66_1");
        return foodList;
    }
}
