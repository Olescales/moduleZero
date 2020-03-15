package service;

import exceptions.NoSuchWrapperException;
import model.Wrapper;

import java.io.IOException;
import java.util.List;

public interface WrapperService {

    List<Wrapper> getAllWrapper () throws IOException;

    Wrapper getWrapperByName (String name) throws IOException, NoSuchWrapperException;
}
