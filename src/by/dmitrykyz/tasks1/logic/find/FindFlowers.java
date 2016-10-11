package by.dmitrykyz.tasks1.logic.find;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.List;

/**
 * Created by Dmitry on 10/11/2016.
 */
public interface FindFlowers {
    public List<Flower> findFlowers(List<Flower> flowers, String[] args);
}
