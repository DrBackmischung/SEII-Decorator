package main;

public class VeganCupcake implements Cupcake {

	@Override
	public String getDescription() {
		return "Cupcake - oder auch Muffin für Reiche (aber vegan).";
	}

	@Override
	public String getIngredients() {
		return "Veganer Teig (Apfelmus, Mehl, Zucker, Tierbabys)";
	}

	@Override
	public double getPrice() {
		return 3;
	}

}
