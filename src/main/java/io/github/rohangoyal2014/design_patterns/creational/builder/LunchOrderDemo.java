package io.github.rohangoyal2014.design_patterns.creational.builder;

public class LunchOrderDemo {

	public static void main(String[] args) throws Exception {
//		This fails decide to order of execution and its mutable
//		But this is flexible
//		LunchOrderBean lunchOrder = new LunchOrderBean();
//		lunchOrder.setBread("Wheat");
//		lunchOrder.setCondiments("Lettuce");
//		lunchOrder.setDressing("Mustard");
//		lunchOrder.setMeat("Ham");
		
//		This is immutable and there is some ordering
//		But, we can not select customized orders likes only condiments and dressing
//		LunchOrderTelescoped lunchOrder = new LunchOrderTelescoped("Wheat", "Lettuce", "Mustard");
		
//		This gives flexibility of setters and immutability of telescoping
		LunchOrder lunchOrder = new LunchOrder.Builder()
											  .bread("Wheat")
											  .dressing("Mustard")
											  .meat("Ham")
											  .build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}
	
}
