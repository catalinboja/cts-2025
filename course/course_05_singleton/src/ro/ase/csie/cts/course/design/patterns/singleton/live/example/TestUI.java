package ro.ase.csie.cts.course.design.patterns.singleton.live.example;

public class TestUI {
	
	public static void checkCredentials(String username, String password) {
		//DBConnection myConnection = new DBConnection();
		DBConnection myConnection = DBConnection.createUniqueObject();
		myConnection.sendData();
	}
	
	public static void getToDoItems() {
		//DBConnection myConnection = new DBConnection();
		DBConnection myConnection = DBConnection.createUniqueObject();
		myConnection.sendData();
	}
	

	public static void main(String[] args) {
		checkCredentials("admin", "1234");
		getToDoItems();
		DBConnection myConnection1 = DBConnection.createUniqueObject();
		DBConnection myConnection2 = DBConnection.createUniqueObject();
		
		if(myConnection1 == myConnection2) {
			System.out.println("Is the same object");
		} else {
			System.out.println("They are different objects");
		}
	}

}
