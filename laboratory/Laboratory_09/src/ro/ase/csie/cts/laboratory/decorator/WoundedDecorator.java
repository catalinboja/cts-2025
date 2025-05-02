package ro.ase.csie.cts.laboratory.decorator;

public class WoundedDecorator extends AbstractACMEHeroDecorator{

	public WoundedDecorator(ACMESuperHero hero) {
		super(hero);
	}

	@Override
	public void moves(int distance) {
		if(hero.points < 10) {
			System.out.println("Is not moving. It can't");
		} else {
			super.moves(distance);
		}
	}
	
	

}
