package cts.csie.ase.ro.patterns.state;

public class NormalState implements IHeroState{

	Hero hero;
	
	public NormalState(Hero hero) {
		super();
		this.hero = hero;
	}

	@Override
	public void move(int distance) {

		System.out.println("Moves normally for " + distance);
	}

	@Override
	public void heal(int points, Hero hero) {
		this.hero.addPoints(points);
	}

}
