package by.dmitrykyz.tasks1.factory.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class Flower {
    private double price;   //цена за цветок
    private String name;    //название цветка
    private String color;   //цвет
    private int length;     //длина цветка
    private int colFlowers; //количество бутонов в цветке

    public Flower() {
    }

    public Flower(double price, String color, int length, int colFlowers) {
        this.price = price;
        this.color = color;
        this.length = length;
        this.colFlowers = colFlowers;
        setName("Unknown");
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getColFlowers() {
        return colFlowers;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColFlowers(int colFlowers) {
        this.colFlowers = colFlowers;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Flower " + name + " with " + colFlowers
                + " " + color + " flower and lenghth "
                + length + " has " + price + "$ price");
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
