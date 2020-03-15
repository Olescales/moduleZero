package dao;

import model.Bouquet;

public interface DAOBouquet {

    Bouquet deleteFlowerFromBouquet(Bouquet bouquet, String flowerName);
    Long saveBouquet (Bouquet bouquet);
}
