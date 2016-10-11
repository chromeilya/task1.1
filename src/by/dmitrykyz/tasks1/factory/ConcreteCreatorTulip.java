package by.dmitrykyz.tasks1.factory;

import by.dmitrykyz.tasks1.factory.entity.Flower;
import by.dmitrykyz.tasks1.factory.entity.Tulip;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class ConcreteCreatorTulip extends Creator {
    @Override
    public Flower factoryMethod() {
        return new Tulip();
    }
}
