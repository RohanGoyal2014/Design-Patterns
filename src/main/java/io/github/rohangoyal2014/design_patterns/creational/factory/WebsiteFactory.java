package io.github.rohangoyal2014.design_patterns.creational.factory;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType websiteType) {
		switch(websiteType) {
			case SHOP: return new Shop();
			case BLOG: return new Blog();
			default: return null;
		}
	}
	
}
