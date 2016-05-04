package Observer;

public class Lights extends Observer {

	public Lights(SensorSystem subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println(String.format("Lights up: state %s", subject.getState()));		
	}

}
