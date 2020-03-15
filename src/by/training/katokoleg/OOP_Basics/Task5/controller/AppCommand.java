package controller;

import controller.dto.Response;
import exceptions.CantSaveEmptyBouquetException;
import exceptions.WrongFlowerNameException;

import java.io.IOException;
import java.util.Map;

public interface AppCommand {
    Response execute (Map<String,Object> userData) throws IOException, WrongFlowerNameException, CantSaveEmptyBouquetException;
}
