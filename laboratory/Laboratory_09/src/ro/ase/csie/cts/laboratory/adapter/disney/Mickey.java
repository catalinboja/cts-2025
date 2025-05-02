package ro.ase.csie.cts.laboratory.adapter.disney;

public class Mickey implements DisneyHero {

	String name;
	float actionPoints;
	boolean isHappy;
	

	public Mickey(String name, float actionPoints, boolean isHappy) {
		super();
		this.name = name;
		this.actionPoints = actionPoints;
		this.isHappy = isHappy;
	}

	@Override
	public String getHeroName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void interact(float actionPoints) {

		System.out.println("Interacts with other heroes");
	}

	@Override
	public void restoreHealth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
