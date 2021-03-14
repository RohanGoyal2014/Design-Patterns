package io.github.rohangoyal2014.design_patterns.creational.singleton;

/**
 * Notes: 
 * 1. Singletons are difficult to unit test
 * 2. java.util.Calendar is not a singleton
 * 
 * @author Rohan
 *
 */
public class DbSingleton {

	// 1. volatile helps in thread-safe access to variable
	// 2. did not instantiaye the object here and used lazy loading to improve performance 
	//    on startup
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		if(instance != null) {
			// to prevent reflecting from creating an object
			throw new RuntimeException("Use getInstance() method to create object");
		}
	}
	
	public synchronized static DbSingleton getInstance() {
		// lazy loading
		if(instance == null) {
			instance = new DbSingleton();
		}
		return instance;
	}
	
}
