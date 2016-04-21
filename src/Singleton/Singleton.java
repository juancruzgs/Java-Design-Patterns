package Singleton;

public class Singleton extends SingletonParent {

	private static Singleton instance;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public String printSomething() {
		return super.printSomething() + "Something";
	}
}
