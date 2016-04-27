package Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component {

	protected List<Component> childs = new ArrayList<Component>();
	
	public Composite(int value) {
		super(value);
	}

	@Override
	public void add(Component c) {
		childs.add(c);
	}

	@Override
	public Component getChild(int position) {
		if (position >= 0 && position < childs.size()) {
			return childs.get(position);
		}
		
		return null;
	}
}
