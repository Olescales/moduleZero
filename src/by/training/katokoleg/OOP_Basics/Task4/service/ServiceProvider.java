package by.htp.task1.service;

import by.htp.task1.service.impl.JewelServiceIMPL;

public class ServiceProvider {
	private final static ServiceProvider sprovider = new ServiceProvider();
	
	private JewelServiceIMPL jewelServiceIMPL = new JewelServiceIMPL();
	
	private ServiceProvider () {}

	public static ServiceProvider getInstance() {
		return sprovider;
	}

	public JewelServiceIMPL getJewelServiceIMPL() {
		return jewelServiceIMPL;
	}
	
	
}
