package designPattern.composite;

public class Client {
	private Component root = new Beleg();
	
	public void buildStructure(){
		root.add(new Auslieferung());
		Auslieferung a1 = (Auslieferung) root.add(new Auslieferung());
		FIDoc f0 = (FIDoc) a1.add(new FIDoc());
		f0.add(new ControllingAnalyse());
		a1.add(new FIDoc());
		root.add(new Auslieferung());
	}
}
