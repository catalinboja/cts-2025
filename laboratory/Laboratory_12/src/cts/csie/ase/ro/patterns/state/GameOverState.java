package cts.csie.ase.ro.patterns.state;

public class GameOverState implements IHeroState{

	@Override
	public void move(int distance) {
		System.out.println("GAME OVER !");
	}

	@Override
	public void heal(int points, Hero hero) {
		System.out.println("GAME OVER !");
	}

}
