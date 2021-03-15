package io.github.rohangoyal2014.design_patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	protected List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createPages();
	}
	
	public abstract void createPages();

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
	
}
