package Visitor;

public class Those implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String those() {
		return "those";
	}
}
