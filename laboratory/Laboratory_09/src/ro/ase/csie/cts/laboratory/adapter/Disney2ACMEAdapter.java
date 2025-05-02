package ro.ase.csie.cts.laboratory.adapter;

import ro.ase.csie.cts.laboratory.adapter.disney.DisneyHero;

public class Disney2ACMEAdapter extends ACMESuperHero{
	
	DisneyHero disneyHero;
	
	public Disney2ACMEAdapter(DisneyHero hero) {
		super(hero.getHeroName(), 50);
		this.disneyHero = hero;
	}

	@Override
	public void attack(String enemy) {
		System.out.println("Attacking " + enemy);
		this.disneyHero.interact(20);
	}

	@Override
	public void heal(int points) {
		this.disneyHero.restoreHealth();
	}
}
