package ro.ase.csie.cts.groups.composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractGroupNode{
	
	List<AbstractGroupNode> nodes = 
			 new ArrayList<>();

	@Override
	public void move(int distance) {
		//move the entire group
		for(AbstractGroupNode node : nodes) {
			node.move(distance);
		}
	}

	@Override
	public void defend(int points) {
		//do nothing
		throw new UnsupportedOperationException();
	}

	@Override
	public void attack(int points) {
		// the entire group attacks
		for(AbstractGroupNode node : nodes) {
			node.attack(points);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNode(AbstractGroupNode node) {
		this.nodes.add(node);
	}

	@Override
	public AbstractGroupNode getNode(int index) {
		if(index > this.nodes.size() - 1)
			return null;
		return this.nodes.get(index);
	}

	@Override
	public void removeNode(AbstractGroupNode node) {
		this.nodes.remove(node);
	}

	@Override
	public int getGroupSize() {
		return this.nodes.size();
	}

	@Override
	public void displayOnScreen() {
		// TODO Auto-generated method stub
		
	}

}
