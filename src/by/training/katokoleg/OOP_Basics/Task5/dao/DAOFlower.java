package dao;

import exceptions.NoSuchFlowerException;
import model.Flower;

import java.io.IOException;
import java.util.List;

public interface DAOFlower {
    List<Flower> getFlowers() throws IOException;

    Flower getFlowerByName(String name) throws IOException, NoSuchFlowerException;
}
