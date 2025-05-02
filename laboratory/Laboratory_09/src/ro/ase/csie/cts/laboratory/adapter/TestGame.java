package ro.ase.csie.cts.laboratory.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.laboratory.adapter.disney.Mickey;

public class TestGame {

	public static void main(String[] args) {
		
		KnightHero knight = new KnightHero("Percival", 100);
		knight.attack("Dark wizard");
		MagicianHero magician = new MagicianHero("Merlin", 50);
		magician.heal(25);
		
		ArrayList<ACMESuperHero> heroes = new ArrayList<>();
		heroes.add(knight);
		heroes.add(magician);
		
		Mickey disneyHero = new Mickey("Mouse", 1000, true);
		disneyHero.interact(50);
		
		heroes.add(new Disney2ACMEAdapter(disneyHero));
		
		for(ACMESuperHero hero : heroes) {
			hero.attack("Vader");
		}
		
		ACMESuperHero adaptedMickey = 
				new Disney2ACMEAdapter(disneyHero);
		
		
		ACMESuperHero newAdaptedDisneyHero = 
				new Disney2ACMEClassAdapter("Batman", 200);
		newAdaptedDisneyHero.moves(10);
		
	}

}
