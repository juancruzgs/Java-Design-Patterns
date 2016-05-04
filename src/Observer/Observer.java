package Observer;

public abstract class Observer {

	protected SensorSystem subject;
	
	protected Observer(SensorSystem subject) {
		super();
		this.subject = subject;
		subject.attach(this);
	}

	public abstract void update();
}
