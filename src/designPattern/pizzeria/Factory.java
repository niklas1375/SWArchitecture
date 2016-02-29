package designPattern.pizzeria;

import java.util.ArrayList;

public class Factory {
	private static ArrayList<Factory> listOfFactories = new ArrayList<>();

	protected Factory() {
		listOfFactories.add(new DefaultFactory());
		listOfFactories.add(new MAFactory());
	}

	public static Factory getMultiton(String location) {
		switch (location) {
		case "MA":
			return listOfFactories.get(1);

		default:
			return listOfFactories.get(0);
		}
	}

	public Pizza createPizza(String type) {
		return null;
	}
}
