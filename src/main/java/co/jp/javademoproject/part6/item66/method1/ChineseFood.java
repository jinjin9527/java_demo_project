package co.jp.javademoproject.part6.item66.method1;

import java.util.ArrayList;
import java.util.List;

public class ChineseFood extends BaseFood {

    @Override
    public List<String> getFoodList() {
        List<String> foodList = new ArrayList<>();
        foodList.add("noodle66_1");
        foodList.add("rice66_1");
        return foodList;
    }
}
