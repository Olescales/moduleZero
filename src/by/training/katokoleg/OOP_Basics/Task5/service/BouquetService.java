package service;

import controller.Session.State;
import exceptions.WrongFlowerNameException;
import model.Bouquet;

public interface BouquetService {

    Bouquet deleteFlowerFromBouquet (Bouquet bouquet, String flowerName) throws WrongFlowerNameException;

    Long saveBouquet (State Bouquet);
}
