package dao;

import controller.Session.State;
import exceptions.NoSuchFlowerException;
import model.Flower;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DAOFlowerImpl implements DAOFlower {

    public List<Flower> getFlowers() throws IOException {
        List<Flower> flowers = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("inputFlower.txt"), StandardCharsets.UTF_8))) {
            while (fileReader.ready()) {
                String[] flowerInfo = fileReader.readLine().split("/");
                Flower flower = new Flower();
                flower.setName(flowerInfo[0]);
                flower.setPrice(new BigDecimal(flowerInfo[1]));
                flower.setColor(flowerInfo[2]);
                flower.setSize(Integer.parseInt(flowerInfo[3]));

                flowers.add(flower);
            }
            return flowers;
        }
    }

    public Flower getFlowerByName(String name) throws IOException, NoSuchFlowerException {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("inputFlower.txt"), StandardCharsets.UTF_8))) {
            Flower flower = new Flower();
            while (fileReader.ready()) {
                String[] flowerInfo = fileReader.readLine().split("/");
                if (flowerInfo[0].equals(name)) {
                    flower.setName(flowerInfo[0]);
                    flower.setPrice(new BigDecimal(flowerInfo[1]));
                    flower.setColor(flowerInfo[2]);
                    flower.setSize(Integer.parseInt(flowerInfo[3]));

                } else {
                    throw new NoSuchFlowerException("Flower " + name + " not found");
                }
            }
            return flower;
        }
    }
}
