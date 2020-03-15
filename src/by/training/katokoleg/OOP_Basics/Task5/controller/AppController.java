package controller;

import exceptions.CantSaveEmptyBouquetException;
import exceptions.WrongFlowerNameException;

import java.io.IOException;
import java.util.Map;

public class AppController {

    private final AppCommandFactory commandFactory;

    public AppController(AppCommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }

    public void handleUserData(Map<String, Object> userData)  {
        final String commandName = (String)userData.get("commandName");
        final AppCommand command = commandFactory.getAppCommand(commandName);
        try {
            command.execute(userData);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WrongFlowerNameException e) {
            e.printStackTrace();
        } catch (CantSaveEmptyBouquetException e) {
            e.printStackTrace();
        }
    }
}
