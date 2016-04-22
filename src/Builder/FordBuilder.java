package Builder;

public class FordBuilder extends AutoBuilder {

	@Override
	public void buildMarca() {
		auto.setMarca("Ford");
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Focus");
	}

}
