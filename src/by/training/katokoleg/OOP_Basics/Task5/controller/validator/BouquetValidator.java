package controller.validator;

import controller.Session.State;
import exceptions.CantSaveEmptyBouquetException;

import java.util.Map;

public class BouquetValidator {

    public boolean validate (Map<String,Object> userData) throws CantSaveEmptyBouquetException {

        State bouquet = (State)userData.get("bouquet");

        if (bouquet.getFlowers() == null || bouquet.getPackSheet() == null) {
            throw new CantSaveEmptyBouquetException("This bouquet is empty.");
        }
        return true;
    }
}
