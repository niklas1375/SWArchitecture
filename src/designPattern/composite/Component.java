package designPattern.composite;

import java.util.ArrayList;

public abstract class Component {
	private ArrayList<Component> children = new ArrayList<>();
	
	public Component add(Component child){
		children.add(child);
		return this;
	}
	
	public void remove(Component child){
		try {
			children.remove(child);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public Component getChild(int index){
		try {
			return children.get(index);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
}
