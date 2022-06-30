package main;

public class NormalCupcake implements Cupcake {

	@Override
	public String getDescription() {
		return "Cupcake - oder auch Muffin für Reiche.";
	}

	@Override
	public String getIngredients() {
		return "Normaler Teig (Milch, Mehl, Zucker, Eier)";
	}

	@Override
	public double getPrice() {
		return 3;
	}

}
