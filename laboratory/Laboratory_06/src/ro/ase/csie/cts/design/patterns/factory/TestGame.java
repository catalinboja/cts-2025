package ro.ase.csie.cts.design.patterns.factory;

import java.util.ArrayList;

public class TestGame {

	public static void main(String[] args) {
		
		ArrayList<SpaceObject> spaceObjects = 
				new ArrayList<SpaceObject>();
		
		SpaceObject planet = new Planet("Mars", "red", 2345435);
//		SpaceObject meteor1 = new Meteorite("M1", "grey", 140);
//		SpaceObject meteor2 = new Meteorite("M2", "black", 90);
		
		spaceObjects.add(planet);
//		spaceObjects.add(meteor1);
//		spaceObjects.add(meteor2);

		SpaceObject meteor1 = 
				SpaceObjectFactory.getSpaceObject(
						SpaceObjectType.METEORITE, "M1");
		

	}

}
