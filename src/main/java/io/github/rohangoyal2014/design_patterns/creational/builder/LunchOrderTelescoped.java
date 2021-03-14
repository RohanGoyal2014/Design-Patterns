package io.github.rohangoyal2014.design_patterns.creational.builder;

public class LunchOrderTelescoped {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;

	public LunchOrderTelescoped(String bread) {
		this.bread = bread;
	}

	public LunchOrderTelescoped(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}

	public LunchOrderTelescoped(String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
	}

	public LunchOrderTelescoped(String bread, String condiments, String dressing, String meat) {
		this(bread, condiments, meat);
		this.meat = meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

}
