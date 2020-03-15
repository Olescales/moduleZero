package service;

import dao.DAOWrapper;
import dao.DAOWrapperImpl;
import exceptions.NoSuchWrapperException;
import model.Wrapper;

import java.io.IOException;
import java.util.List;

public class WrapperServiceImpl implements WrapperService {

    private DAOWrapper daoWrapper;

    public WrapperServiceImpl(DAOWrapper daoWrapper) {
        this.daoWrapper = daoWrapper;
    }

    @Override
    public List<Wrapper> getAllWrapper() throws IOException {
        return daoWrapper.getWrappers();
    }

    @Override
    public Wrapper getWrapperByName(String name) throws IOException, NoSuchWrapperException {
        return daoWrapper.getWrapperByName(name);
    }
}
