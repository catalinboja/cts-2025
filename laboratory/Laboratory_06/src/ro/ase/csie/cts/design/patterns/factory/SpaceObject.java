package ro.ase.csie.cts.design.patterns.factory;

public abstract class SpaceObject {
	protected String objectName;
	protected String color;
	
	public SpaceObject(String objectName, String color) {
		super();
		this.objectName = objectName;
		this.color = color;
	}

}
