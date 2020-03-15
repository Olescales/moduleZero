package by.htp.task1.controller;

import by.htp.task1.controller.command.Command;
import by.htp.task1.controller.command.CommandProvider;

public class JewelController {

	private CommandProvider provider = new CommandProvider();

	public String doAction(String commandName) {
		String responce = null;
		Command command = provider.getCommand(commandName);
		responce = command.execute();
		
		return responce;
	}
}
