package ChainOfResponsibility;

public class ConsoleLogger extends Handler {

	public ConsoleLogger() {
		level = Handler.INFO;
	}

	@Override
	protected void write(String message) {
		System.out.println(String.format("Console Logger: %s", message));
	}
	
}
