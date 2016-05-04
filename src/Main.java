

import AbstractFactory.AbstractFactory;
import AbstractFactory.Alfajor;
import AbstractFactory.Balcarce;
import AbstractFactory.Havanna;
import AbstractFactory.Postre;
import Adapter.LineAdapter;
import Adapter.RectangleAdapter;
import Adapter.ShapeAdapter;
import Bridge.Circle;
import Bridge.GreenCircle;
import Bridge.RedCircle;
import Bridge.ShapeAbstraction;
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
import Image.Image;
import Image.ProxyImage;
import Observer.Gates;
import Observer.Lights;
import Observer.Observer;
import Observer.SensorSystem;
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
		/*
		OrderFacade facade = new OrderFacade();
		facade.placeOrder("O111");
		*/
		
		//Proxy
		/*
		Image proxy = new ProxyImage("image");
		proxy.display();
		proxy.display();
		*/
		
		//Adapter
		/*
		ShapeAdapter adapter = new RectangleAdapter();
		adapter.draw(10, 20, 30, 60);
		
		adapter = new LineAdapter();
		adapter.draw(10, 20, 30, 60);
		*/
		
		//Bridge
		/*
		ShapeAbstraction abstraction = new Circle(new RedCircle(), 1, 2, 3);
		abstraction.draw();
		
		abstraction = new Circle(new GreenCircle(), 4, 5, 6);
		abstraction.draw();
		*/
		
		//Observer
		SensorSystem sensorSystem = new SensorSystem();
		Observer lights = new Lights(sensorSystem);
		Observer gates = new Gates(sensorSystem);
		
		sensorSystem.setState(1);
		
		sensorSystem.detach(gates);
		sensorSystem.setState(2);
		
	}

}
