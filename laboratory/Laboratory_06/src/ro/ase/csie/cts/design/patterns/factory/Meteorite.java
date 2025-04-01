package ro.ase.csie.cts.design.patterns.factory;

public class Meteorite extends SpaceObject{
	
	int speed;
	float angle;

	public Meteorite(
			String objectName, String color, int speed, float angle) {
		super(objectName, color);
		this.speed = speed;
		this.angle = angle;
	}

}
