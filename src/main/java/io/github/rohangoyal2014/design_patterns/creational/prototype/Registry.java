package io.github.rohangoyal2014.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		Book book = new Book();
		book.setTitle("Alchemist");
		book.setNumberOfPages(200);
		book.setPrice(159.50);
		items.put("Book", book);
		
		Movie movie = new Movie();
		movie.setTitle("New Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hours");
		items.put("Movie", movie);
	}

}
