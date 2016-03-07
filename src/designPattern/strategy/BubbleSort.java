package designPattern.strategy;

import java.util.Arrays;

public class BubbleSort implements SorterIF {

	@Override
	public int[] sort(int[] sourceArray) {
		return bubblesort(Arrays.copyOf(sourceArray, sourceArray.length));
	}
	
	public static int[] bubblesort(int[] zusortieren) {
		int temp;
		for(int i=1; i<zusortieren.length; i++) {
			for(int j=0; j<zusortieren.length-i; j++) {
				if(zusortieren[j]>zusortieren[j+1]) {
					temp=zusortieren[j];
					zusortieren[j]=zusortieren[j+1];
					zusortieren[j+1]=temp;
				}
				
			}
		}
		return zusortieren;
	}

}
