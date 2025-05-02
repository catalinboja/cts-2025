package ro.ase.csie.cts.laboratory.decorator;

public abstract class ACMESuperHero {
	String name;
	int points;
	
	public ACMESuperHero(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	public void moves(int distance) {
		System.out.println(this.name + " moves for " + distance);
	}
	
	public void printDescription() {
		System.out.println("Is a hero");
	}
	
	
	public abstract void attack(String enemy);
	public abstract void heal(int points);
	
	
}





