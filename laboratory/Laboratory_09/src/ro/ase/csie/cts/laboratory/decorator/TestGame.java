package ro.ase.csie.cts.laboratory.decorator;

public class TestGame {

	public static void main(String[] args) {
		
		ACMESuperHero knight1 = 
				new KnightHero("Knight1", 100);
		ACMESuperHero knight2 = 
				new KnightHero("Knight2", 5);
		
		knight1.moves(10);
		knight2.moves(10);
		
		knight2 = new WoundedDecorator(knight2);
		
		knight1.moves(10);
		knight2.moves(10);
		
		knight2 = new ShieldDecorator(knight2, 50);
		
		knight1.moves(10);
		knight2.moves(10);
		
		knight1.printDescription();
		knight2.printDescription();
		
	}

}
