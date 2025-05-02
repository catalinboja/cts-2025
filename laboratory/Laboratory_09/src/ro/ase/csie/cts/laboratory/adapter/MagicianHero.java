package ro.ase.csie.cts.laboratory.adapter;

public class MagicianHero extends ACMESuperHero{

	public MagicianHero(String name, int points) {
		super(name, points);
	}

	@Override
	public void attack(String enemy) {	
		System.out.println("The magician apply a spell on " +
				enemy);
	}

	@Override
	public void heal(int points) {
		this.points += (points * 2);
	}

}
