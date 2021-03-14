package io.github.rohangoyal2014.design_patterns.creational.singleton;

public class DbSingletonDemo {
	public static void main(String[] args) {
		DbSingleton singleton = DbSingleton.getInstance();
		System.out.println(singleton);
		DbSingleton singleton2 = DbSingleton.getInstance();
		System.out.println(singleton2);
		System.out.println(singleton == singleton2);
	}
}
