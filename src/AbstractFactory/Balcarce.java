package AbstractFactory;

public class Balcarce implements AbstractFactory {

	@Override
	public Postre createPostre() {
		return new PostreBalcarce();
	}

	@Override
	public Alfajor createAlfajor() {
		return new AlfajorConDulceDeLeche();
	}

	
}
