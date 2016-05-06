package ChainOfResponsibility;

public class ErrorLogger extends Handler {

	public ErrorLogger() {
		level = Handler.ERROR;
	}

	@Override
	protected void write(String message) {
		System.out.println(String.format("Error Logger: %s", message));
	}
}
