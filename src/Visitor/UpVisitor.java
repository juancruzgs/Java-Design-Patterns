package Visitor;

public class UpVisitor implements Visitor {

	@Override
	public void visit(That element) {
		System.out.println(String.format("Do up on: %s", element.that()));	
	}

	@Override
	public void visit(Those element) {
		System.out.println(String.format("Do up on: %s", element.those()));
	}

}
