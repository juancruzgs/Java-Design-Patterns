package AbstractFactory;

public class Havanna implements AbstractFactory {

	@Override
	public Postre createPostre() {
		return new PostreTiramisu();
	}

	@Override
	public Alfajor createAlfajor() {
		return new Alfajor2Pisos();
	}
}
