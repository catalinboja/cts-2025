package cts.csie.ase.ro.patterns.state;

public class Hero {

	private int lifePoints;
	private String name;
	
	//state reference
	IHeroState state = null;
	
	public static final int WOUNDED_LIMIT = 50;
	
	public Hero(String name) {
		super();
		this.lifePoints = 100;
		this.name = name;
		
		//set an initial state
		this.state = new NormalState(this);
	}
	
	public void addPoints(int points) {
		this.lifePoints += points;
	}
	
	
	public void setState(IHeroState state) {
		this.state = state;
	}

	public int getPoints() {
		return this.lifePoints;
	}
	
	public void move(int distance) {
		if(this.state != null) {
			this.state.move(distance);
		}
	}
	
	public void heal(int points) {
		if(this.state != null) {
			this.state.heal(points, this);
		}
	}
	
	public void getAHit(int points) {
		this.lifePoints -= points;
		if(this.lifePoints < Hero.WOUNDED_LIMIT) {
			this.state = new WoundedState(this);
		}
		if(this.lifePoints <= 0) {
			this.state = new GameOverState();
		}
	}
	
}
