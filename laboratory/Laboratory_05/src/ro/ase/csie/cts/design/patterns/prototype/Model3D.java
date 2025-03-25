package ro.ase.csie.cts.design.patterns.prototype;

import java.util.ArrayList;
import java.util.Random;

public abstract class Model3D {
	
	protected ArrayList<Integer> modelPoints;
	
	protected Model3D() {
		
	}
	
	public Model3D(int noPoints) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.modelPoints = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < noPoints; i++) {
			this.modelPoints.add(random.nextInt(1000));
		}
	}
	
}
