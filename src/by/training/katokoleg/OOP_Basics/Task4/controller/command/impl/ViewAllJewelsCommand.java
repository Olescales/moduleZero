package by.htp.task1.controller.command.impl;

import java.util.List;

import by.htp.task1.controller.command.Command;
import by.htp.task1.entity.Jewel;
import by.htp.task1.service.JewelService;
import by.htp.task1.service.ServiceProvider;

public class ViewAllJewelsCommand implements Command{

	@Override
	public String execute() {
		
		ServiceProvider provider = ServiceProvider.getInstance();
		JewelService service = provider.getJewelServiceIMPL();
		List<Jewel> jewels = service.viewAllJewels("Treasury.txt");
		
		String responce = null;
		if (jewels != null) {
			responce = jewels.toString(); 
		} else {
			responce = "error!!!!";
		}
		return responce;
		
	}

}
