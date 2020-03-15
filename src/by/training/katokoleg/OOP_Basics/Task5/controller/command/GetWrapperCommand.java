package controller.command;

import controller.AppCommand;
import controller.dto.Response;
import service.WrapperService;

import java.io.IOException;
import java.util.Map;

public class GetWrapperCommand implements AppCommand {

    private WrapperService wrapperService;

    public GetWrapperCommand(WrapperService wrapperService) {
        this.wrapperService = wrapperService;
    }

    @Override
    public Response execute(Map<String,Object> userData) throws IOException {
        Response response = new Response();
        response.setWrappers(wrapperService.getAllWrapper());
        return response;
    }
}