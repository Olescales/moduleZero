package service;

import dao.DAOFlowerImpl;
import exceptions.NoSuchFlowerException;
import model.Flower;

import java.io.IOException;
import java.util.List;

public interface FlowerService {

    List<Flower> getAllFlowers () throws IOException;

    Flower getFlowerByName (String flowerName) throws IOException, NoSuchFlowerException;


}
