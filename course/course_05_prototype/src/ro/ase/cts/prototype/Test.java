package ro.ase.cts.prototype;


public class Test {

	public static void main(String[] args) {
	
		SpaceShip spaceShip1 = new SpaceShip("Federation");
		SpaceShip spaceShip2 = new SpaceShip("Federation");
		
		
		SpaceShip spaceShip3 = (SpaceShip) spaceShip2.clone();
		//using the Prototype
//		SpaceShip spaceShip2 = (SpaceShip) spaceShip1.clone();
//		SpaceShip spaceShip3 = (SpaceShip) spaceShip1.clone();
		
		System.out.println("Done");
	}

}
