package io.github.rohangoyal2014.design_patterns.creational.abstract_factory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(720);
		CreditCard amexCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(amexCard);
		
		CreditCardFactory abstractFactory2 = CreditCardFactory.getCreditCardFactory(600);
		CreditCard visaCard = abstractFactory2.getCreditCard(CardType.PLATINUM);
		System.out.println(visaCard);
	}
	
}
