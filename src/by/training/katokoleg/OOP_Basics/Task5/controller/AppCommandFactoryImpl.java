package controller;

import controller.dto.Response;
import controller.dto.ResponseMessage;

import java.util.Map;

public class AppCommandFactoryImpl implements AppCommandFactory {

    private Map<AppCommandName, AppCommand> commands;

    public AppCommandFactoryImpl(Map<AppCommandName, AppCommand> commands) {
        this.commands = commands;
    }

    @Override
    public AppCommand getAppCommand(String commandName) {
        final AppCommandName appCommandName = AppCommandName.fromString(commandName);
        return commands.getOrDefault(appCommandName,answer -> new ResponseMessage("Bad command"));
    }
}
