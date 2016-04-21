package FactoryMethod;

public class CreadorAuto implements CreadorVehiculos {

	@Override
	public Vehiculo crear() {
		return new Auto();
	}
	
}
