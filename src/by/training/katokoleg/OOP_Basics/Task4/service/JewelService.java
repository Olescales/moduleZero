package by.htp.task1.service;

import java.util.List;
import by.htp.task1.entity.Jewel;

public interface JewelService {

	Jewel chooseMostExpensiveJewel (String fileName);
	List<Jewel> viewAllJewels (String fileName);
}
