package ro.ase.csie.cts.groups.composite;

public class NPC extends AbstractGroupNode{
	
	String name;
	String color;
	int points  = 100;
	

	public NPC(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	@Override
	public void move(int distance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defend(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNode(AbstractGroupNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractGroupNode getNode(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeNode(AbstractGroupNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getGroupSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayOnScreen() {
		// TODO Auto-generated method stub
		
	}

}
