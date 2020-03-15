package controller.command;

import controller.AppCommand;
import controller.dto.BouquetResponse;
import controller.dto.Response;
import controller.validator.FlowerValidator;
import controller.dto.FlowerValidatorResponse;
import exceptions.WrongFlowerNameException;
import model.Bouquet;
import service.BouquetService;

import java.util.Map;

public class RemoveFlowerByNameFromBouquetCommand implements AppCommand {

    private BouquetService bouquetService;

    private FlowerValidator flowerValidator = new FlowerValidator();

    public RemoveFlowerByNameFromBouquetCommand(BouquetService bouquetService) {
        this.bouquetService = bouquetService;
    }

    @Override
    public Response execute(Map<String, Object> userData) throws WrongFlowerNameException {
        FlowerValidatorResponse flowerValidatorResponse = flowerValidator.validate(userData);
        BouquetResponse bouquetResponse = new BouquetResponse();

        if (flowerValidatorResponse.isEmpty()) {
            String flower = (String) userData.get("flowerName");
            Bouquet bouquet = (Bouquet) userData.get("bouquet");
            bouquetResponse.setBouquet(bouquetService.deleteFlowerFromBouquet(bouquet, flower));
        }
        return bouquetResponse;
    }
}
