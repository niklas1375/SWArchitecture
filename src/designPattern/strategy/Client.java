package designPattern.strategy;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("Enter command:");
			String in = s.nextLine();
			if (in.equals("exit")) {
				break;
			} else {
				if (in.equals("go")) {
					int length = (int)(Math.random() * 20);
					int[] randArray = new int[length];
					for (int i = 0; i < randArray.length; i++) {
						randArray[i] = (int)(Math.random() * 1024);
					}
					System.out.println("New random array created: " + Arrays.toString(randArray));
					int rand = (int) (Math.random() * 3);
					Context context;
					switch (rand) {
					case 0:
						context = new Context(new QuickSort());
						break;
					
					case 1:
						context = new Context(new RandomSort());
						break;
						
					case 2:
						context = new Context(new BubbleSort());
						break;

					default:
						context = new Context(new RandomSort());
						break;
					}
					System.out.println("Using " + context.getSorter() + "...");
					long tmp = System.currentTimeMillis();
					System.out.println("Ergebnis: " + Arrays.toString(context.sortiereElemente(randArray)));
					System.out.println("Zeit: " + (System.currentTimeMillis() - tmp) / 1000.0 + "s");
				} else {
					System.out.println("Not a valid command!");
				}
			}
		}
		s.close();
	}
}
