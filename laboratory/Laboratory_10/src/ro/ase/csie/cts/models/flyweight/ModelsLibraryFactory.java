package ro.ase.csie.cts.models.flyweight;

import java.util.HashMap;

public class ModelsLibraryFactory {
	static HashMap<String, Model3DFlyweightInterface> models = 
			new HashMap<>();
	
	static {
		//Init the models for tree, building and spaceship
		models.put("Tree", new Model3DFlyweight("Tree"));
		models.put("Building", new Model3DFlyweight("Building"));
		models.put("Spaceship", new Model3DFlyweight("Spaceship"));
	}
	
	public static Model3DFlyweightInterface getModel(String name) {
		Model3DFlyweightInterface model = models.get(name);
		if(model == null) {
			throw new UnsupportedOperationException();
		}
		return model;
	}
}
