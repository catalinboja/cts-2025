package ro.ase.csie.cts.design.patterns.factory;

public class SpaceObjectFactory {
	
	public static SpaceObject getSpaceObject(
			SpaceObjectType type, String name) {
		switch(type) {
		case PLANET:
			return new Planet(name, "blue", 0);
		case METEORITE:
			return new Meteorite(name, "black", 100, 0);
		default:
				throw new UnsupportedOperationException();
		}
	}

}
