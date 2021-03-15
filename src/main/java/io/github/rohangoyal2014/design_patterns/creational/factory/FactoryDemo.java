package io.github.rohangoyal2014.design_patterns.creational.factory;

/**
 * Calendar is a factory pattern
 * Factory Pattern solves complex creation
 * 
 * @author Rohan
 *
 */
public class FactoryDemo {
	
	public static void main(String[] args) {
		Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(blog.getPages());
		
		Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(shop.getPages());
	}
}
