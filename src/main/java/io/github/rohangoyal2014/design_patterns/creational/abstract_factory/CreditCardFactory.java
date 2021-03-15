package io.github.rohangoyal2014.design_patterns.creational.abstract_factory;

public abstract class CreditCardFactory {
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 650) {
			return new AmexFactory();
		}
		return new VisaFactory();
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	public abstract Validator getCreditCardValidator(CardType cardType);
}
