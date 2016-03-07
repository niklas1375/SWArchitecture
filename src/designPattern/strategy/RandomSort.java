package designPattern.strategy;

import java.util.Arrays;

public class RandomSort implements SorterIF {
	int[] sorted;

	@Override
	public int[] sort(int[] sourceArray) {
		sorted = Arrays.copyOf(sourceArray, sourceArray.length);
		Arrays.sort(sorted);
		long time = System.currentTimeMillis();
		int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
		int i = 0;
		while (!isSorted(targetArray)) {
			shuffle(targetArray);
			if (i%10000000 == 0 && i != 0) {
				System.out.println("Zwischenstand " + i + " in " + (System.currentTimeMillis() - time) / 1000.0);
			}
			i++;
		}
		return targetArray;
	}
	
	private void shuffle(int[] i) {
		for (int x = 0; x < i.length; x++) {
			int index1 = (int) (Math.random() * i.length);
			int a = i[x];
			i[x] = i[index1];
			i[index1] = a;
		}
	}
	
	private boolean isSorted(int[] toCheck){
		if (toCheck.length == 1) {
			return true;
		}
		for (int i = 1;i < toCheck.length; i++) {
			if (toCheck[i - 1] > toCheck[i]) {
				return false;
			}
		}
		return true;
	}

}
