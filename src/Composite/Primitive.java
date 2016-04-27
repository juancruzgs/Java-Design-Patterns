package Composite;

public class Primitive extends Component {

	public Primitive(int value) {
		super(value);
	}

	@Override
	public void add(Component c) {
	}

	@Override
	public void traverse() {
		System.out.println(value);
	}

	@Override
	public Component getChild(int position) {
		return null;
	}

}
