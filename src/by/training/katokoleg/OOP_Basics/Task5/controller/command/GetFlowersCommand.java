package controller.command;

import controller.AppCommand;
import controller.dto.Response;
import service.FlowerService;

import java.io.IOException;
import java.util.Map;

public class GetFlowersCommand implements AppCommand {

    private FlowerService flowerService;

    public GetFlowersCommand(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @Override
    public Response execute(Map<String,Object> userData) throws IOException {
        Response response = new Response();
        response.setFlowers(flowerService.getAllFlowers());
        return response;
    }
}
