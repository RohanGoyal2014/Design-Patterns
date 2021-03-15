package io.github.rohangoyal2014.design_patterns.creational.factory;

public class Shop extends Website {

	@Override
	public void createPages() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
