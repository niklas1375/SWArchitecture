package designPattern.abstractFactory;

public class Pizzeria {
	private ZutatenFabrik zutatenFabrik;
	
	public void orderPizza(String location) {
		zutatenFabrik = ZutatenFabrik.getMultiton(location);
		System.out.println(zutatenFabrik.createKaese().getType());
		System.out.println(zutatenFabrik.createSalami().getType());
		System.out.println(zutatenFabrik.createSchinken().getType());
	}
}
