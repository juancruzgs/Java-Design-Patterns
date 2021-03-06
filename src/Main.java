

import java.util.ArrayList;
import java.util.List;

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
import ChainOfResponsibility.ConsoleLogger;
import ChainOfResponsibility.ErrorLogger;
import ChainOfResponsibility.FileLogger;
import ChainOfResponsibility.Handler;
import Command.Broker;
import Command.BuyStock;
import Command.Command;
import Command.SellStock;
import Command.Stock;
import Composite.Column;
import Composite.Component;
import Composite.Primitive;
import Composite.Row;
import Facade.OrderFacade;
import FactoryMethod.CreadorAuto;
import FactoryMethod.CreadorCamion;
import FactoryMethod.CreadorVehiculos;
import FactoryMethod.Vehiculo;
import Observer.ConcreteSubject;
import Observer.Gates;
import Observer.Lights;
import Observer.Observer;
import Observer.SensorSystem;
import Prototype.LCD;
import Prototype.Plasma;
import Prototype.PrototypeFactory;
import Prototype.TV;
import Proxy.Image;
import Proxy.ProxyImage;
import Singleton.Singleton;
import Singleton.StaticClass;
import State.Button;
import Strategy.Context;
import Strategy.OperationAdd;
import Strategy.OperationMultiply;
import Visitor.DownVisitor;
import Visitor.Element;
import Visitor.That;
import Visitor.Those;
import Visitor.UpVisitor;
import Visitor.Visitor;

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
		/*
		ConcreteSubject sensorSystem = new ConcreteSubject();
		Observer lights = new Lights(sensorSystem);
		Observer gates = new Gates(sensorSystem);
		
		sensorSystem.attach(lights);
		sensorSystem.attach(gates);
		sensorSystem.setState(1);
		
		sensorSystem.detach(gates);
		sensorSystem.setState(2);
		
		
		//Command
		/*
		Stock receiver = new Stock();
		
		Command buyCommand = new BuyStock(receiver);
		Command sellCommand = new SellStock(receiver);
		
		Broker invoker = new Broker();
		invoker.addCommand(buyCommand);
		invoker.addCommand(sellCommand);
		
		invoker.executeCommands();
		*/
		
		//State
		/*
		Button context = new Button();
		context.press();
		context.press();
		context.press();
		*/
		
		//Strategy
		/*
		Context context = new Context(new OperationAdd());
		context.execute(1, 2);
		
		context = new Context(new OperationMultiply());
		context.execute(1, 2);
		*/
		
		//Chain of Responsibility
		/*
		Handler head = new ErrorLogger();
		Handler file = new FileLogger();
		Handler console = new ConsoleLogger();
		
		head.setNextHandler(file);
		file.setNextHandler(console);
		
		head.logMessage(Handler.INFO, "information");
		head.logMessage(Handler.DEBUG, "debug");
		head.logMessage(Handler.ERROR, "error");
		*/
		
		//Visitor
		List<Element> list = new ArrayList();
		list.add(new Those());
		list.add(new That());
		
		for (Element element : list) {
			element.accept(new UpVisitor());
			element.accept(new DownVisitor());
		}
	}

}
