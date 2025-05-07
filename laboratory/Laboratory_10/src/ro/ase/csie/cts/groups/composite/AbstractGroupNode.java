package ro.ase.csie.cts.groups.composite;

public abstract class AbstractGroupNode 
	extends AbstractGroup implements NPCInterface{

	public abstract void addNode(AbstractGroupNode node);
	public abstract AbstractGroupNode getNode(int index);
	public abstract void removeNode(AbstractGroupNode node);
}
