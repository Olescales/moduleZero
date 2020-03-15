package dao;

import model.Bouquet;
import model.Flower;

import java.util.Optional;

public class DAOBouquetImpl implements DAOBouquet {

    @Override
    public Bouquet deleteFlowerFromBouquet(Bouquet bouquet, String flowerName) {
        Optional<Flower> flowerToRemove = bouquet.getFlowers().stream().filter(flower -> flower.getName().equals(flowerName)).findFirst();
        bouquet.getFlowers().remove(flowerToRemove.get());
        return bouquet;
    }

    @Override
    public Long saveBouquet(Bouquet bouquet) {
        return 1L;
    }
}
