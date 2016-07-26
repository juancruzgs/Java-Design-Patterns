package Observer;

public class Lights implements Observer {
	
	ConcreteSubject subject;

	public Lights(ConcreteSubject subject) {
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println(String.format("Lights up: state %s", subject.getState()));		
	}

}
