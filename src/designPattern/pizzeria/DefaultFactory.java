package designPattern.pizzeria;

public class DefaultFactory extends Factory {
	@Override
	public Pizza createPizza(String type) {
		switch (type) {
			case "ham":
				return new HamPizza();
				
			case "salami":
				return new SalamiPizza();
				
			case "tuna":
				return new TunaPizza();

			default:
				return null;
		}
	}
}
