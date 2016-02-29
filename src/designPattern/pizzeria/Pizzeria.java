package designPattern.pizzeria;

import java.util.Scanner;

public class Pizzeria {
	private Factory f;

	public Pizzeria(String location) {
		f = Factory.getMultiton(location);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pizzeria p = new Pizzeria(s.nextLine());
		while (true) {
			String in = s.nextLine();
			if (!in.equals("exit")) {
				p.orderPizza(in);
			} else {
				s.close();
				return;
			}
		}
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = f.createPizza(type);

		if (pizza != null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.pack();
		} else {
			System.out.println("I'm not a pizza!");
		}

		return pizza;
	}

}
