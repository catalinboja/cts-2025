package ro.ase.csie.cts.design.patterns.builder;

public class Hero {
	
	private String name;
	private int points;
	private boolean isCriticalWounded;
	private boolean isBuffed;
	private String leftHandWeapon;
	private String rightHandWeapon;
	private String shieldType;
	
	//we do this to force devs to use the builder
	private Hero() {
		
	}
	
	
	
	private void setName(String name) {
		this.name = name;
	}



	private void setPoints(int points) {
		this.points = points;
	}



	private void setCriticalWounded(boolean isCriticalWounded) {
		this.isCriticalWounded = isCriticalWounded;
	}



	private void setBuffed(boolean isBuffed) {
		this.isBuffed = isBuffed;
	}



	private void setLeftHandWeapon(String leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}



	private void setRightHandWeapon(String rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}



	private void setShieldType(String shieldType) {
		this.shieldType = shieldType;
	}
	
	
	public String getName() {
		return name;
	}



	public int getPoints() {
		return points;
	}

	public boolean isCriticalWounded() {
		return isCriticalWounded;
	}

	public boolean isBuffed() {
		return isBuffed;
	}

	public String getLeftHandWeapon() {
		return leftHandWeapon;
	}

	public String getRightHandWeapon() {
		return rightHandWeapon;
	}

	public String getShieldType() {
		return shieldType;
	}

	
	public static class HeroBuilder {
		
		//eager version
		private Hero hero = new Hero();
		
		public HeroBuilder(String name) {
			this.hero.name = name;
		}
		
		public HeroBuilder addPoints(int points) {
			this.hero.points = points;
			return this;
		}
		
		public HeroBuilder isBuffed() {
			this.hero.isBuffed = true;
			return this;
		}
		
		public HeroBuilder isWounded() {
			this.hero.isCriticalWounded = true;
			return this;
		}
		
		public HeroBuilder addRightHandWeapon(String weapon) {
			this.hero.rightHandWeapon = weapon;
			return this;
		}
		
		public HeroBuilder addLeftHandWeapon(String weapon) {
			this.hero.leftHandWeapon = weapon;
			return this;
		}
		
		public HeroBuilder addShield(String shield) {
			this.hero.shieldType = shield;
			return this;
		}
		
		public Hero build() {
			return this.hero;
		}
		
	}
	
}





