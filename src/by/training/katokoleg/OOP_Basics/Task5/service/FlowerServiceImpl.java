package service;

import dao.DAOFlower;
import exceptions.NoSuchFlowerException;
import model.Flower;

import java.io.IOException;
import java.util.List;

public class FlowerServiceImpl implements FlowerService {

    private DAOFlower daoFlower;

    public FlowerServiceImpl(DAOFlower daoFlower) {
        this.daoFlower = daoFlower;
    }

    @Override
    public List<Flower> getAllFlowers() throws IOException {
        return daoFlower.getFlowers();
    }

    @Override
    public Flower getFlowerByName(String flowerName) throws IOException, NoSuchFlowerException {
        return daoFlower.getFlowerByName(flowerName);
    }
}
