package designPattern.composite;

public class ControllingAnalyse extends Component {
	@Override
	public Component add(Component child){
		throw new Error("no children possible");
	}
	
	@Override
	public void remove(Component child){
		throw new Error("no children available");
	}
	
	@Override
	public Component getChild(int index){
		throw new Error("no children possible");
	}
}
