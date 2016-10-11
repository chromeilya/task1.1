package by.dmitrykyz.tasks1.logic.sort;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.Comparator;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class SortByColFlowers implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        int colFlowers1 = o1.getColFlowers();
        int colFlowers2 = o2.getColFlowers();

        if(colFlowers1 > colFlowers2) {
            return 1;
        }
        else if(colFlowers1 < colFlowers2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
