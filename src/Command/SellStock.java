package Command;

public class SellStock implements Command {

	private Stock stock;
	
	public SellStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();		
	}
	

}
