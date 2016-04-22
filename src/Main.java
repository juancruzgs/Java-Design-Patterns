import AbstractFactory.AbstractFactory;
import AbstractFactory.Alfajor;
import AbstractFactory.Balcarce;
import AbstractFactory.Havanna;
import AbstractFactory.Postre;
import Builder.Auto;
import Builder.Director;
import Builder.FiatBuilder;
import FactoryMethod.CreadorAuto;
import FactoryMethod.CreadorCamion;
import FactoryMethod.CreadorVehiculos;
import FactoryMethod.Vehiculo;
import Singleton.Singleton;
import Singleton.StaticClass;

public class Main {

	public static void main(String[] args) {
		//Singleton
		/*
		System.out.println(Singleton.getInstance().printSomething());
		System.out.println(StaticClass.printSomething());
		*/
		
		//Abstract Factory
		/*
		AbstractFactory factory = new Havanna();
		Alfajor alfajor = factory.createAlfajor();
		Postre postre = factory.createPostre();
		System.out.print(String.format("%1$s , %2$s" , alfajor.maicenearse(), postre.glacearse()));
		*/
		
		//Factory Method
		/*
		CreadorVehiculos factory = new CreadorCamion();
		Vehiculo vehiculo = factory.crear();
		System.out.println(vehiculo.arrancar());
		*/
		
		//Builder
		/*
		Director director = new Director(new FiatBuilder());
		Auto auto = director.construct();
		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());
		*/
		
		
		
	}

}
