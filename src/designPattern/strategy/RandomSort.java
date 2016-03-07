package designPattern.strategy;

import java.util.Arrays;

public class RandomSort implements SorterIF {

	@Override
	public int[] sort(int[] sourceArray) {
		int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
		while (!isSorted(targetArray)) {
			shuffle(targetArray);
		}
		return targetArray;
	}
	
	private void shuffle(int[] i) {
		for (int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length);
			int index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}
	
	private boolean isSorted(int[] i){
		for (int x = 0; x < i.length - 1; ++x) {
			if (i[x] > i[x + 1]) {
				return false;
			}
		}
		return true;
	}

}
