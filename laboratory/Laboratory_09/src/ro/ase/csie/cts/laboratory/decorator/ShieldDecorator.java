package ro.ase.csie.cts.laboratory.decorator;

public class ShieldDecorator extends AbstractACMEHeroDecorator{

	int shieldStrength;
	
	public ShieldDecorator(
			ACMESuperHero hero, int strength) {
		super(hero);
		this.shieldStrength = strength;
	}

	@Override
	public void printDescription() {
		super.printDescription();
		System.out.println("Hero with a shield");
	}
	
	public void defend() {
		System.out.println("Hero uses shield");
	}
	
	

}
