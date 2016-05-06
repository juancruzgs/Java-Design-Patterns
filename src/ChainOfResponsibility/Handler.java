package ChainOfResponsibility;

public abstract class Handler {

	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	
	private Handler nextHandler;
	protected int level;
	
	public void setNextHandler(Handler handler) {
		nextHandler = handler;
	}
	
	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		
		if (nextHandler != null) {
			nextHandler.logMessage(level, message);
		}
	}
	
	abstract protected void write(String message);
}
