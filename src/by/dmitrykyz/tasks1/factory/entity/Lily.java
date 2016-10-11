package by.dmitrykyz.tasks1.factory.entity;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class Lily extends Flower{
    public Lily(double price, String color, int length, int colFlowers) {
        super(price, color, length, colFlowers);
        setName("Lily");
    }

    public Lily() {
        setPrice(99.9);
        setName("Lily");
        setColFlowers(5);
        setColor("Pink");
        setLength(50);
    }
}
