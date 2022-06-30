package main;

public class CupcakeBuilder {
	
	public static void main(String[] args) {
		
		Cupcake rainbow = new RainbowPoopTopping(new VeganCupcake());
		System.out.println(rainbow.getDescription());
		System.out.println("Zutaten: "+rainbow.getIngredients());
		System.out.println(rainbow.getPrice() + "€");
		
		Cupcake cake = new OreoTopping(new WhippedCream(new RainbowPoopTopping(new NormalCupcake())));
		System.out.println(cake.getDescription());
		System.out.println("Zutaten: "+cake.getIngredients());
		System.out.println(cake.getPrice() + "€");
		
	}
	
}
