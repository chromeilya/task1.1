package by.dmitrykyz.tasks1.main;

import by.dmitrykyz.tasks1.factory.*;
import by.dmitrykyz.tasks1.factory.entity.Flower;
import by.dmitrykyz.tasks1.logic.BouquetOfFlowers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class Main {
    public static void main(String[] args) {

        //Create flower using patern Factory and add all flower to List flowers
        Creator[] creators = {new ConcreteCreatorTulip(), new ConcreteCreatorRouse(),
                              new ConcreteCreatorChamomile(), new ConcreteCreatorLily()};
        List<Flower> flowers = new ArrayList<>();
        for (Creator creator: creators) {
            Flower flower = creator.factoryMethod();
            flowers.add(flower);
        }

        //Add all created flowers to bouguet
        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers(flowers);
        System.out.println("------All flowers in bouquet-----");
        System.out.println(bouquetOfFlowers);

        //Show total price flowers in bouquet
        System.out.println("------Total price bouquet--------");
        System.out.println(bouquetOfFlowers.totalPrice());

        //Show different sort (You can use: .sortByPrice() .sortByName() .sortByColor() .sortByLength() .sortByColFlowers())
        System.out.println("------Sort flowers by price-------");
        bouquetOfFlowers.sortByPrice();
        for (Flower fl: bouquetOfFlowers.getFlowers()) {
            System.out.println(fl);
        }

        //Show search according to various criteria
        //You can use seach:  .findFlowersByPrice(Double minPrice, Double maxPrice)
        //                    .findFlowersByLength(Integer minLength, Integer maxLength)
        //                    .findFlowersByColFlowers(Integer minFlowers, Integer maxFlowers)
        //                    .findFlowersByColor(String color)
        //                    .findFlowersByName(String name)
        System.out.println("--------Search by color-----------");
        for (Flower fl: bouquetOfFlowers.findFlowersByColor("yellow")) {
            System.out.println(fl);
        }
        System.out.println("--------------------------------------------");

    }
}
