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
import Prototype.LCD;
import Prototype.Plasma;
import Prototype.PrototypeFactory;
import Prototype.TV;
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
		
		//Prototype
		PrototypeFactory.addPrototype("lcd", new LCD("LCD"));
		PrototypeFactory.addPrototype("plasma",  new Plasma("Plasma"));
		
		TV plasma = PrototypeFactory.makeObject("plasma");
		System.out.println(plasma.getName());
		
		PrototypeFactory.removePrototype("plasma");
		TV newPlasma = PrototypeFactory.makeObject("plasma");
		System.out.println(newPlasma.getName());
		
	}

}
