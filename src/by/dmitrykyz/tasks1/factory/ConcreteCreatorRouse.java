package by.dmitrykyz.tasks1.factory;

import by.dmitrykyz.tasks1.factory.entity.Flower;
import by.dmitrykyz.tasks1.factory.entity.Rouse;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class ConcreteCreatorRouse extends Creator {
    @Override
    public Flower factoryMethod() {
        return new Rouse();
    }
}
