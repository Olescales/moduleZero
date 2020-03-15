package controller.command;

import controller.AppCommand;
import controller.Session.State;
import controller.dto.Response;
import controller.validator.BouquetValidator;
import exceptions.CantSaveEmptyBouquetException;
import service.BouquetService;

import java.util.Map;

public class SaveBouquetCommand implements AppCommand {

    private BouquetService bouquetService;

    private BouquetValidator bouquetValidator = new BouquetValidator();

    public SaveBouquetCommand(BouquetService bouquetService) {
        this.bouquetService = bouquetService;
    }

    @Override
    public Response execute(Map<String, Object> userData) throws CantSaveEmptyBouquetException {
        bouquetValidator.validate(userData);
        State bouquet = (State) userData.get("bouquet");
        Response response = new Response();
        response.setId(bouquetService.saveBouquet(bouquet));
        return response;
    }
}