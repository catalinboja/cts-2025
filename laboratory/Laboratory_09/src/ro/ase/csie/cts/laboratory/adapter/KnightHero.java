package ro.ase.csie.cts.laboratory.adapter;

public class KnightHero extends ACMESuperHero{

	public KnightHero(String name, int points) {
		super(name, points);
	}

	@Override
	public void attack(String enemy) {
		System.out.println("The knight attacks " + enemy +
				" for 20 points");
	}

	@Override
	public void heal(int points) {
		this.points += points;
	}

}
