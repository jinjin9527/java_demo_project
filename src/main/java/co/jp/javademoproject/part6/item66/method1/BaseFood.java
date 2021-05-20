package co.jp.javademoproject.part6.item66.method1;

import java.util.List;

public abstract class BaseFood implements SupplyFood{

    public abstract List<String> getFoodList();

    @Override
    public void supplyFood() {
        for(String indexFood : getFoodList()){
            System.out.println(indexFood + " ");
        }
        System.out.println();
    }
}
