package ro.ase.csie.cts.design.patterns.builder.separate;

public class Hero {
	
	private String name;
	private int points;
	private boolean isCriticalWounded;
	private boolean isBuffed;
	private String leftHandWeapon;
	private String rightHandWeapon;
	private String shieldType;
	
	//we do this to force devs to use the builder
	Hero() {
		
	}
	
	
	
	void setName(String name) {
		this.name = name;
	}



	void setPoints(int points) {
		this.points = points;
	}



	void setCriticalWounded(boolean isCriticalWounded) {
		this.isCriticalWounded = isCriticalWounded;
	}



	void setBuffed(boolean isBuffed) {
		this.isBuffed = isBuffed;
	}



	void setLeftHandWeapon(String leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}


	void setRightHandWeapon(String rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}


	void setShieldType(String shieldType) {
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

}





