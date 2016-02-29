package designPattern.pizzeria;

public abstract class Pizza {

	public void prepare() {
		System.out.println("I'm being prepared.");
	}

	public void bake() {
		System.out.println("I'm being baked.");
	}

	public void cut() {
		System.out.println("I'm being cut.");
	}

	public void pack() {
		System.out.println("I'm being packed.");
	}
	
}
