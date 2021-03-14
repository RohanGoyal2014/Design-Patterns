package io.github.rohangoyal2014.design_patterns.creational.singleton;

/**
 * Notes:
 * Singleton needs to be thread-safe
 * No parameters to getInstance, else it turns into factory pattern
 * Spring Beans are singleton
 * 
 * @author Rohan
 *
 */
public class SingletonRuntime {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		System.out.println(runtime);
		
		Runtime anotherRuntime = Runtime.getRuntime();
		System.out.println(anotherRuntime);
		
		if(runtime == anotherRuntime) {
			System.out.println("They are same!");
		}
	}
}
