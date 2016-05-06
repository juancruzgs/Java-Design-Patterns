package Strategy;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void execute(int num1, int num2) {
		strategy.doOperation(num1, num2);
	}
}
