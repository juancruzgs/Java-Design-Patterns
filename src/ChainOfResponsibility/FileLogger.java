package ChainOfResponsibility;

public class FileLogger extends Handler {

	public FileLogger() {
		level = Handler.DEBUG;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(String.format("File Logger: %s", message));
	}

}
