package main;

public class RainbowPoopTopping extends ToppingDecorator {

	public RainbowPoopTopping(Cupcake c) {
		super(c);
	}
	
	public String getDescription() {
		return c.getDescription() + " Mit Regenbogenkacke wird alles niedlicher :)";
	}
	
	public String getIngredients() {
		return c.getIngredients() + ", Lebensmittelfarbe, Diabetes";
	}
	
	public double getPrice() {
		return c.getPrice() + 0.5;
	}

}
