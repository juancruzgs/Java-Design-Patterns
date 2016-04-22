package Builder;

public class Director {
	
	AutoBuilder builder;

	public Director(AutoBuilder builder) {
		this.builder = builder;
	}
	
	public Auto construct() {
		builder.createAuto();
		builder.buildMarca();
		builder.buildModelo();
		return builder.getAuto();
	}
}
