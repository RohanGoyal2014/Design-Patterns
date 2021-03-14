package io.github.rohangoyal2014.design_patterns.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Data Structures & Algorithms in Java");
		
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getUrl());
		
		Movie movie2 = (Movie) registry.createItem("Movie");
		movie2.setTitle("Data Structures & Algorithms in C++");
		
		System.out.println(movie2);
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getPrice());
		System.out.println(movie2.getRuntime());
		System.out.println(movie2.getUrl());
		
		
	}
	
}
