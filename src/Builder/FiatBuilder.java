package Builder;

public class FiatBuilder extends AutoBuilder {

	@Override
	public void buildMarca() {
		auto.setMarca("Fiat");
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Palio");
	}

}
