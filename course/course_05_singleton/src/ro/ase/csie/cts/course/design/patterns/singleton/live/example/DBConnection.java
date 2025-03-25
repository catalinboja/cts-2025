package ro.ase.csie.cts.course.design.patterns.singleton.live.example;

public class DBConnection {
	
	private static DBConnection theUniqueObjectReference = null;
	
	private DBConnection() {
		
	}
	
	public void sendData() {
		System.out.println("Sending data to DB....");
	}
	
	public static synchronized DBConnection createUniqueObject() {
		if(theUniqueObjectReference == null)
			theUniqueObjectReference = new DBConnection();
		return theUniqueObjectReference;
	}
}
