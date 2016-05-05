package Command;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Broker {

	private List<Command> commands = new ArrayList<>();
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void executeCommands() {
		for (Command command : commands) {
			command.execute();
		}
		
		commands.clear();
	}
}
