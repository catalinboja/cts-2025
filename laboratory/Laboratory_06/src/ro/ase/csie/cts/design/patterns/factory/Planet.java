package ro.ase.csie.cts.design.patterns.factory;

public class Planet extends SpaceObject{
	
	float mass;
	
	public Planet(String objectName, String color, float mass) {
		super(objectName, color);
		this.mass = mass;
	}

}
