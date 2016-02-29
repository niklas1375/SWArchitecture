package designPattern.pizzeria;

public class MAFactory extends Factory {
	@Override
	public Pizza createPizza(String type) {
		switch (type) {
			case "ham":
				return new MannheimHamPizza();
				
			case "salami":
				return new SalamiPizza();
				
			case "tuna":
				return new TunaPizza();

			default:
				return null;
		}
	}
}
