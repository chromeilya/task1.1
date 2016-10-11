package by.dmitrykyz.tasks1.factory.entity;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class Tulip extends Flower {
    public Tulip(double price, String color, int length, int colFlowers) {
        super(price, color, length, colFlowers);
        setName("Tulip");
    }

    public Tulip() {
        setPrice(80.3);
        setName("Tulip");
        setColFlowers(1);
        setColor("Yellow");
        setLength(20);
    }
}
