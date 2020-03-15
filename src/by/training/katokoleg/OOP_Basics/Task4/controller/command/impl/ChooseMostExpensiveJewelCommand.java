package by.htp.task1.controller.command.impl;

import by.htp.task1.controller.command.Command;
import by.htp.task1.entity.Jewel;
import by.htp.task1.service.JewelService;
import by.htp.task1.service.ServiceProvider;

public class ChooseMostExpensiveJewelCommand implements Command {

	@Override
	public String execute() {
				
		ServiceProvider provider = ServiceProvider.getInstance();
		JewelService service = provider.getJewelServiceIMPL();
		Jewel jewel = service.chooseMostExpensiveJewel("Treasury.txt");
		
		String responce = null;
		if (jewel != null) {
			responce = "The most expensive treasure: " + jewel.getJewelsName() + ". It cost " + jewel.getJewejsCost(); 
		} else {
			responce = "error!!!!";
		}
		return responce;
	}

}
