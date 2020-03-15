package by.htp.task1.dao;

import java.util.List;

import by.htp.task1.entity.*;

public interface JewelDAO {

	List<Jewel> getJewels(String fileName);
}
