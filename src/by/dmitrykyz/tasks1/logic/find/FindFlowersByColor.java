package by.dmitrykyz.tasks1.logic.find;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class FindFlowersByColor implements FindFlowers {
    @Override
    public List<Flower> findFlowers(List<Flower> flowers, String[] args) {
        List<Flower> foundFlowers = new ArrayList<Flower>();
        String color = args[0];
        for(Flower flower : flowers){
            if(flower.getColor().toLowerCase().equals(color.toLowerCase())){
                foundFlowers.add(flower);
            }
        }
        if(foundFlowers.size()==0) System.out.println("Do not find flowers with color " + color + "!");
        return foundFlowers;
    }
}
