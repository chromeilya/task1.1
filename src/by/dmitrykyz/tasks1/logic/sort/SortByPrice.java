package by.dmitrykyz.tasks1.logic.sort;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.Comparator;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class SortByPrice implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        double price1 = o1.getPrice();
        double price2 = o2.getPrice();

        if(price1 > price2) {
            return 1;
        }
        else if(price1 < price2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
