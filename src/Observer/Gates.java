package Observer;


public class Gates extends Observer {

	public Gates(SensorSystem subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println(String.format("Gates close: state %s", subject.getState()));		
	}

}
