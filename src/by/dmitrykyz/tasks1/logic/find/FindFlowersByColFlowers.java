package by.dmitrykyz.tasks1.logic.find;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class FindFlowersByColFlowers implements FindFlowers {


    @Override
    public List<Flower> findFlowers(List<Flower> flowers, String[] args) {
        try {
            List<Flower> foundFlowers = new ArrayList<Flower>();
            int minColFlowers = Integer.parseInt(args[0]);
            int maxColFlowers = Integer.parseInt(args[1]);

            for (Flower flower : flowers) {
                if (flower.getColFlowers() >= minColFlowers && flower.getColFlowers() <= maxColFlowers) {
                    foundFlowers.add(flower);
                }
            }
            if (foundFlowers.size() == 0) System.out.println("Do not find flowers for this parameters!");
            return foundFlowers;
        } catch (Exception e){
            System.out.println("Not correct args");
            return null;
        }
    }
}