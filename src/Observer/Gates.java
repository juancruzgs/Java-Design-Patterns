package Observer;


public class Gates implements Observer {

	ConcreteSubject subject;
	
	public Gates(ConcreteSubject subject) {
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println(String.format("Gates close: state %s", subject.getState()));		
	}

}
