package Composite;

public class Column extends Composite {

	public Column(int value) {
		super(value);
	}

	@Override
	public void traverse() {
		System.out.println("Column" + value);
		for (Component child : childs) {
			child.traverse();
		}
	}

}
