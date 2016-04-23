package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	    private static Map<String, TV> prototypes = new HashMap<String, TV>();

	    public static void addPrototype(String key, TV tv) {
	    	prototypes.put(key, tv);
	    }
	    
	    public static void removePrototype(String key) {
	    	prototypes.remove(key);
	    }
	    
	    public static TV makeObject(String s) {
	      TV tv = prototypes.get(s);
	      if (tv == null) {
	    	  return new LCD("New Object");
	      }
	      return tv.cloneObject();
	    }
}
