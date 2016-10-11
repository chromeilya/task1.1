package by.dmitrykyz.tasks1.logic;

import by.dmitrykyz.tasks1.factory.entity.Flower;
import by.dmitrykyz.tasks1.logic.find.*;
import by.dmitrykyz.tasks1.logic.sort.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Collections;
import java.util.List;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class BouquetOfFlowers {

    private List<Flower> flowers;

    public BouquetOfFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public double totalPrice(){
        double totalPrice = 0;
        for(Flower flower: flowers ){
            totalPrice += flower.getPrice();
        }
        return totalPrice;
    }

    public void sortByName(){
        Collections.sort(flowers, new SortByName());
    }

    public void sortByColor(){
        Collections.sort(flowers, new SortByColor());
    }

    public void sortByPrice(){
        Collections.sort(flowers, new SortByPrice());
    }

    public void sortByLength(){
        Collections.sort(flowers, new SortByLength());
    }

    public void sortByColFlowers(){
        Collections.sort(flowers, new SortByColFlowers());
    }

    public List<Flower> findFlowersByPrice(Double minPrice, Double maxPrice){
        FindFlowers findFlowers = new FindFlowersByPrice();
        return findFlowers.findFlowers(getFlowers(), new String[]{minPrice.toString(), maxPrice.toString()});
    }

    public List<Flower> findFlowersByLength(Integer minLength, Integer maxLength){
        FindFlowers findFlowers = new FindFlowersByLength();
        return findFlowers.findFlowers(getFlowers(),new String[]{minLength.toString(), maxLength.toString()});
    }

    public List<Flower> findFlowersByColFlowers(Integer minFlowers, Integer maxFlowers){
        FindFlowers findFlowers = new FindFlowersByColFlowers();
        return findFlowers.findFlowers(getFlowers(),new String[]{minFlowers.toString(), maxFlowers.toString()});
    }

    public List<Flower> findFlowersByColor(String color){
        FindFlowers findFlowers = new FindFlowersByColor();
        return findFlowers.findFlowers(getFlowers(),new String[]{color});
    }

    public List<Flower> findFlowersByName(String name){
        FindFlowers findFlowers = new FindFlowersByName();
        return findFlowers.findFlowers(getFlowers(),new String[]{name});
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Flower flower: getFlowers()) {
            stringBuilder.append(flower + "\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
