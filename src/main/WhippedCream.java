package main;

public class WhippedCream extends ToppingDecorator {

	public WhippedCream(Cupcake c) {
		super(c);
	}
	
	public String getDescription() {
		return c.getDescription() + " Oben dann noch Sahne ~ wie lecker!";
	}
	
	public String getIngredients() {
		return c.getIngredients() + ", Sahne";
	}
	
	public double getPrice() {
		return c.getPrice() + 0.5;
	}
	
}