package io.github.rohangoyal2014.design_patterns.creational.abstract_factory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD: return new VisaGoldCreditCard();
			case PLATINUM: return new VisaPlatinumCreditCard();
			default: return null;
		}
	}

	@Override
	public Validator getCreditCardValidator(CardType cardType) {
		return new VisaValidator();
	}

}
