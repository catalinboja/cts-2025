package cts.csie.ase.ro.patterns.state;

public class WoundedState implements IHeroState{
	
	Hero hero;

	public WoundedState(Hero hero) {
		super();
		this.hero = hero;
	}

	@Override
	public void move(int distance) {
		System.out.println("Is moving slowly for " + distance/2);
	}

	@Override
	public void heal(int points, Hero inputHero) {
		inputHero.addPoints(points);
		if(inputHero.getPoints() >= Hero.WOUNDED_LIMIT) {
			//change the current state of the hero
			inputHero.setState(new NormalState(inputHero));
		}
		
		//alternative if you use the hero reference attribute
//		this.hero.addPoints(points);
//		if(this.hero.getPoints() >= Hero.WOUNDED_LIMIT) {
//			//change the current state of the hero
//			this.hero.setState(new NormalState(inputHero));
//		}
		
		//having both references is not recommended
	}
	

}
