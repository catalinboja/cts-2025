package ro.ase.csie.cts.groups.composite;

public interface NPCInterface {

	public void move(int distance);
	public void defend(int points);
	public void attack(int points);
	public String getName();
}
