package by.htp.task1.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import by.htp.task1.dao.JewelDAO;
import by.htp.task1.entity.Jewel;

public class FileJewelDAO implements JewelDAO {

	@Override

	public List<Jewel> getJewels(String fileName) {

		List<Jewel> jewels = new ArrayList<Jewel>();

		try {
			File file = new File(fileName);
			BufferedReader reader = new BufferedReader(new FileReader("D:\\олег\\Програм\\Java\\Workspace\\JD1Dist\\jd1-hometask-layersarchitecture-katokoleg\\bin\\database\\Treasury.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
			
				Jewel jewel = new Jewel();
				
				String[] tokens = line.split("/");

				double cost = Double.parseDouble(tokens[1]);

				jewel.setJewelsName(tokens[0]);
				jewel.setJewejsCost(cost);

				jewels.add(jewel);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return jewels;
	}

}
