package main;

public class OreoTopping extends ToppingDecorator {

	public OreoTopping(Cupcake c) {
		super(c);
	}
	
	public String getDescription() {
		return c.getDescription() + " Und das ganze Ding extra teuer, weil Oreos.";
	}
	
	public String getIngredients() {
		return c.getIngredients() + ", Oreo";
	}
	
	public double getPrice() {
		return c.getPrice() + 2.5;
	}
	
}