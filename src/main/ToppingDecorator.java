package main;

abstract class ToppingDecorator implements Cupcake {
	
	protected Cupcake c;
	
	public ToppingDecorator(Cupcake c) {
		
		this.c = c;
		
	}
	
	public String getDescription() {
		return c.getDescription();
	}
	
	public String getIngredients() {
		return c.getIngredients();
	}
	
	public double getPrice() {
		return c.getPrice();
	}
	
}
