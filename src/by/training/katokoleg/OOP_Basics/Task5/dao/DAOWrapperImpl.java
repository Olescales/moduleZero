package dao;

import exceptions.NoSuchWrapperException;
import model.Wrapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DAOWrapperImpl implements DAOWrapper {
    public List<Wrapper> getWrappers() throws IOException {
        List<Wrapper> wrappers = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("inputWrapper.txt"), StandardCharsets.UTF_8))) {
            while (fileReader.ready()) {
                String[] wrapperInfo = fileReader.readLine().split("/");
                Wrapper wrapper = new Wrapper();
                wrapper.setName(wrapperInfo[0]);
                wrapper.setPrice(new BigDecimal(wrapperInfo[1]));
                wrapper.setMaterial(wrapperInfo[2]);

                wrappers.add(wrapper);
            }
            return wrappers;
        }
    }

    public Wrapper getWrapperByName(String name) throws IOException, NoSuchWrapperException {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("inputWrapper.txt"), StandardCharsets.UTF_8))) {
            Wrapper wrapper = new Wrapper();
            while (fileReader.ready()) {
                String[] wrapperInfo = fileReader.readLine().split("/");
                if (wrapperInfo[0].equals(name)) {
                    wrapper.setName(wrapperInfo[0]);
                    wrapper.setPrice(new BigDecimal(wrapperInfo[1]));
                    wrapper.setMaterial(wrapperInfo[2]);
                } else {
                    throw new NoSuchWrapperException("Wrapper " + name + " not found");
                }
            }
            return wrapper;
        }
    }
}
