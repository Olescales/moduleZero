package dao;

import exceptions.NoSuchWrapperException;
import model.Flower;
import model.Wrapper;

import java.io.IOException;
import java.util.List;

public interface DAOWrapper {

    List<Wrapper> getWrappers() throws IOException;

    Wrapper getWrapperByName(String name) throws IOException, NoSuchWrapperException;
}
