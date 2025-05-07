package ro.ase.csie.cts.models.flyweight;

public class TestGame {

	public static void main(String[] args) {

		//Create a game room with 2 buildings and 2 trees and a spaceship
		Model3DFlyweightInterface building1 = 
				ModelsLibraryFactory.getModel("Building");
		Model3DFlyweightInterface building2 = 
				ModelsLibraryFactory.getModel("Building");
		
		building1.displayOnScreen(new Coordinates(10, 10));
		building1.displayOnScreen(new Coordinates(25, 5));
		
		ModelsLibraryFactory.getModel("Tree").displayOnScreen(
				new Coordinates(3,100));
		ModelsLibraryFactory.getModel("Tree").displayOnScreen(
				new Coordinates(35,68));
		
		ModelsLibraryFactory.getModel("Spaceship").displayOnScreen(
				new Coordinates(100,90));
	}

}
