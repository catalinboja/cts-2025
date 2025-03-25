package ro.ase.csie.cts.design.patterns.prototype;

import java.util.ArrayList;

public class Building3DModel extends Model3D implements Cloneable{

	
	private String modelName;
	
	public Building3DModel(int noPoints, String modelName) {
		super(noPoints);
		this.modelName = modelName;
	}
	
	private Building3DModel() {
		super();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Building3DModel copy = new Building3DModel();
		copy.modelName = this.modelName;
		copy.modelPoints = (ArrayList<Integer>) this.modelPoints.clone();
		return copy;
	}
	
	

}
