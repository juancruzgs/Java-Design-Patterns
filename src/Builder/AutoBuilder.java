package Builder;

public abstract class AutoBuilder {

	protected Auto auto;
	
	public void createAuto() {
		auto = new Auto();
	}
	
	public Auto getAuto() {
		return auto;
	}
	
	public abstract void buildMarca();
	public abstract void buildModelo();
}
