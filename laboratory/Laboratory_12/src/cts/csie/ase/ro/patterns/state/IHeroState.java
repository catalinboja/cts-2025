package cts.csie.ase.ro.patterns.state;

public interface IHeroState {
	public void move(int distance);
	public void heal(int points, Hero hero);
}
