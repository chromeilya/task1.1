package by.dmitrykyz.tasks1.logic.sort;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.Comparator;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class SortByLength implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        double length1 = o1.getLength();
        double length2 = o2.getLength();

        if(length1 > length2) {
            return 1;
        }
        else if(length1 < length2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

