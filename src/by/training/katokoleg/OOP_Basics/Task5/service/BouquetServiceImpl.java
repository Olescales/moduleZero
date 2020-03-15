package service;

import controller.Session.State;
import dao.DAOBouquet;
import exceptions.WrongFlowerNameException;
import model.Bouquet;

public class BouquetServiceImpl implements BouquetService {

    private DAOBouquet daoBouquet;

    public BouquetServiceImpl(DAOBouquet daoBouquet) {
        this.daoBouquet = daoBouquet;
    }

    @Override
    public Bouquet deleteFlowerFromBouquet(Bouquet bouquet, String flowerName) throws WrongFlowerNameException {

        boolean isThereAFlowerWithSuchNameInBouquet = bouquet.getFlowers().stream().anyMatch(f -> f.getName().equals(flowerName));
        if (isThereAFlowerWithSuchNameInBouquet) {
            return daoBouquet.deleteFlowerFromBouquet(bouquet,flowerName);
        } else {
            throw new WrongFlowerNameException("There isn't flower with such name in this bouquet.");
        }
    }

    @Override
    public Long saveBouquet(State stateBouquet) {
        Bouquet bouquet = new Bouquet();
        bouquet.setFlowers(stateBouquet.getFlowers());
        bouquet.setPackSheet(stateBouquet.getPackSheet());
        return daoBouquet.saveBouquet(bouquet);
    }
}