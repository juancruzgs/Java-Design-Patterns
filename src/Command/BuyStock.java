package Command;

public class BuyStock implements Command {

	private Stock stock;
	
	public BuyStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

}
