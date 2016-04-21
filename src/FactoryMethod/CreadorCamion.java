package FactoryMethod;

public class CreadorCamion implements CreadorVehiculos {

	@Override
	public Vehiculo crear() {
		return new Camion();
	}

}
