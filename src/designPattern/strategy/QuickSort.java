package designPattern.strategy;

import java.util.Arrays;

public class QuickSort implements SorterIF {

	@Override
	public int[] sort(int[] sourceArray) {
		int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
		qSort(targetArray, 0, targetArray.length - 1);
		return targetArray;
	}

	public static void qSort(int x[], int links, int rechts) {
		if (links < rechts) {
			int i = partition(x, links, rechts);
			qSort(x, links, i - 1);
			qSort(x, i + 1, rechts);
		}
	}

	public static int partition(int x[], int links, int rechts) {
		int pivot, i, j, tmp;
		pivot = x[rechts];
		i = links;
		j = rechts - 1;
		while (i <= j) {
			if (x[i] > pivot) {
				tmp = x[i];
				x[i] = x[j];
				x[j] = tmp;
				j--;
			} else
				i++;
		}
		tmp = x[i];
		x[i] = x[rechts];
		x[rechts] = tmp;

		return i;
	}

}
