package by.dmitrykyz.tasks1.factory.entity;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class Rouse extends Flower {

    public Rouse(double price, String color, int length, int colFlowers) {
        super(price, color, length, colFlowers);
        setName("Rouse");
    }

    public Rouse() {
        setPrice(100);
        setName("Rouse");
        setColFlowers(1);
        setColor("Red");
        setLength(30);
    }
}
