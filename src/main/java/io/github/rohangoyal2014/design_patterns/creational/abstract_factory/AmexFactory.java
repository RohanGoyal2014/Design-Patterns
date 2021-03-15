package io.github.rohangoyal2014.design_patterns.creational.abstract_factory;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD: return new AmexGoldCreditCard();
			case PLATINUM: return new AmexPlatinumCreditCard();
			default: return null;
		}
	}

	@Override
	public Validator getCreditCardValidator(CardType cardType) {
		switch (cardType) {
			case GOLD: return new AmexGoldValidator();
			case PLATINUM: return new AmexPlatinumValidator();
			default: return null;
		}
	}

}
