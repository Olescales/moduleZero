package by.htp.task1.dao;

import by.htp.task1.dao.impl.FileJewelDAO;

public class DAOProvider {
	private final static DAOProvider provider = new DAOProvider();
	
	private JewelDAO jewelDAO = new FileJewelDAO();
	
	private DAOProvider() {}

	public static DAOProvider getInstance() {
		return provider;
	}

	public JewelDAO getJewelDAO() {
		return jewelDAO;
	}
	
	
}
