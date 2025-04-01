package ro.ase.csie.cts.design.patterns.builder;

public class TestBuilder {

	public static void main(String[] args) {

		//Hero hero = new Hero();
		Hero hero = new Hero.HeroBuilder("Superman")
				.addPoints(1000)
				.addShield("Energy shield")
				.isBuffed()
				.build();

		
		
	}

}
