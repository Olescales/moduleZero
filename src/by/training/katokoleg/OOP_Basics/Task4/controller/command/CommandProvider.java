package by.htp.task1.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.task1.controller.command.impl.ChooseMostExpensiveJewelCommand;
import by.htp.task1.controller.command.impl.ViewAllJewelsCommand;

public class CommandProvider {
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	public CommandProvider() {
		commands.put("1", new ChooseMostExpensiveJewelCommand());
		commands.put("2", new ViewAllJewelsCommand());
	}

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		
		return command;
	}
	
	
}
