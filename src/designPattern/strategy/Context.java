package designPattern.strategy;

public class Context {
	private SorterIF sorter;
	
	public Context(SorterIF sorter){
		this.sorter = sorter;
	}
	
	public int[] sortiereElemente(int[] sourceArray){
		return sorter.sort(sourceArray);
	}
}
