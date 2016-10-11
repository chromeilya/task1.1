package by.dmitrykyz.tasks1.logic.find;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class FindFlowersByName implements FindFlowers {
    @Override
    public List<Flower> findFlowers(List<Flower> flowers, String[] args) {
        List<Flower> foundFlowers = new ArrayList<Flower>();
        String name = args[0];
        for(Flower flower : flowers){
            if(flower.getName().toLowerCase().equals(name.toLowerCase())){
                foundFlowers.add(flower);
            }
        }
        if(foundFlowers.size()==0) System.out.println("Do not find flowers " + name + "!");
        return foundFlowers;
    }
}
