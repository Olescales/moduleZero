package by.htp.task1.service.impl;

import java.util.List;
import by.htp.task1.dao.DAOProvider;
import by.htp.task1.dao.JewelDAO;
import by.htp.task1.entity.Jewel;
import by.htp.task1.service.JewelService;

public class JewelServiceIMPL implements JewelService {
	
	@Override
	public List<Jewel> viewAllJewels(String fileName) {
		
		DAOProvider provider = DAOProvider.getInstance();
		JewelDAO jewelDAO = provider.getJewelDAO();
		List<Jewel> jewels = jewelDAO.getJewels(fileName);
		
		return jewels;
	}
	
	/*@Override
	public List<Jewel> viewAllJewels(List<Jewel> jewels) {
		//Validation
		List<Jewel> allJewelsList = new ArrayList<Jewel>();
		if (jewels.isEmpty()) {
			return null;
		}
		allJewelsList.addAll(jewels);
		return allJewelsList;
	}*/

	@Override
	public Jewel chooseMostExpensiveJewel(String fileName) {
		
		DAOProvider provider = DAOProvider.getInstance();
		JewelDAO jewelDAO = provider.getJewelDAO();
		List<Jewel> jewels = jewelDAO.getJewels(fileName);
		
		Jewel jewel = new Jewel();
		
		for (Jewel jew : jewels)
		{if (jew.getJewejsCost() > jewel.getJewejsCost()) {
			jewel.setJewejsCost(jew.getJewejsCost());
			jewel.setJewelsName(jew.getJewelsName());
		}
		}
		return jewel;
	}

}
