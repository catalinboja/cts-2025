package ro.ase.csie.cts.design.patterns.builder.separate;

public class HeroBuilder {
	//eager version
	private Hero hero = new Hero();
	
	public HeroBuilder(String name) {
		this.hero.setName(name);
	}
	
	public HeroBuilder addPoints(int points) {
		this.hero.setPoints(points);
		return this;
	}
	
	public HeroBuilder isBuffed() {
		this.hero.setBuffed(true);
		return this;
	}
	
	public HeroBuilder isWounded() {
		this.hero.setCriticalWounded(true);
		return this;
	}
	
	public HeroBuilder addRightHandWeapon(String weapon) {
		this.hero.setRightHandWeapon(weapon);
		return this;
	}
	
	public HeroBuilder addLeftHandWeapon(String weapon) {
		this.hero.setLeftHandWeapon(weapon);
		return this;
	}
	
	public HeroBuilder addShield(String shield) {
		this.hero.setShieldType(shield);
		return this;
	}
	
	public Hero build() {
		return this.hero;
	}
	
}
