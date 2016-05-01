import AbstractFactory.AbstractFactory;
import AbstractFactory.Alfajor;
import AbstractFactory.Balcarce;
import AbstractFactory.Havanna;
import AbstractFactory.Postre;
import Builder.Auto;
import Builder.Director;
import Builder.FiatBuilder;
import Composite.Column;
import Composite.Component;
import Composite.Primitive;
import Composite.Row;
import Facade.OrderFacade;
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
		/*
		PrototypeFactory.addPrototype("lcd", new LCD("LCD"));
		PrototypeFactory.addPrototype("plasma",  new Plasma("Plasma"));
		
		TV plasma = PrototypeFactory.makeObject("plasma");
		System.out.println(plasma.getName());
		
		PrototypeFactory.removePrototype("plasma");
		TV newPlasma = PrototypeFactory.makeObject("plasma");
		System.out.println(newPlasma.getName());
		*/
		
		//Composite
		/*
		Component first = new Row(1);
		Component second = new Column(2);
		Component third = new Column(3);
		Component fourth = new Row(4);
		Component fifth = new Row(5);
		
		first.add(second);
		first.add(third);
		third.add(fourth);
	    third.add( fifth  );                   
	    first.add( new Primitive(6));   
	    second.add(new Primitive(7));  
	    third.add(new Primitive(8));    
	    fourth.add(new Primitive(9));      
	    fifth.add(new Primitive(10));        
	    
	    System.out.println("traverse");
	    System.out.println("---------------");
	    first.traverse();
	    System.out.println();
	    
	    System.out.println("child");
	    System.out.println("---------------");	    
	    Component child = first.getChild(0);
	    if (child != null) {
	    	child.traverse();
	    }
	    */
		
		//Facade
		OrderFacade facade = new OrderFacade();
		facade.placeOrder("O111");
	}

}
