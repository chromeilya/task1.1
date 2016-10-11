package by.dmitrykyz.tasks1.factory.entity;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class Chamomile extends Flower {
    public Chamomile(double price, String color, int length, int colFlowers) {
        super(price, color, length, colFlowers);
        setName("Chamomile");
    }

    public Chamomile() {
        setPrice(50.8);
        setName("Chamomile");
        setColFlowers(1);
        setColor("White");
        setLength(40);
    }
}
