package ro.ase.csie.cts.laboratory.decorator;

public abstract class AbstractACMEHeroDecorator extends ACMESuperHero{
	ACMESuperHero hero;
	
	public AbstractACMEHeroDecorator(ACMESuperHero hero) {
		super(hero.name, hero.points);
		this.hero = hero;
	}

	@Override
	public void attack(String enemy) {
		this.hero.attack(enemy);
	}

	@Override
	public void heal(int points) {
		this.hero.heal(points);
	}

	@Override
	public void moves(int distance) {
		this.hero.moves(distance);
	}
	
	
	
	
	
}
