package Visitor;

public class DownVisitor implements Visitor {

	@Override
	public void visit(That element) {
		System.out.println(String.format("Do down on: %s", element.that()));	
	}

	@Override
	public void visit(Those element) {
		System.out.println(String.format("Do down on: %s", element.those()));
	}
}
