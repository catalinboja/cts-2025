package ro.ase.csie.cts.design.patterns.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("Start");
		
		Building3DModel redHouse1 = 
				new Building3DModel(100, "Red house");
//		Building3DModel redHouse2 = 
//				new Building3DModel(100, "Red house");
//		Building3DModel redHouse3 = 
//				new Building3DModel(100, "Red house");
		
		
		Building3DModel redHouse2 =(Building3DModel) redHouse1.clone();
		Building3DModel redHouse3 =(Building3DModel) redHouse1.clone();
				
		System.out.println("End");
	}
}
