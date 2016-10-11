package by.dmitrykyz.tasks1.factory;

import by.dmitrykyz.tasks1.factory.entity.Chamomile;
import by.dmitrykyz.tasks1.factory.entity.Flower;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class ConcreteCreatorChamomile extends Creator {
    @Override
    public Flower factoryMethod() {
        return new Chamomile();
    }
}
