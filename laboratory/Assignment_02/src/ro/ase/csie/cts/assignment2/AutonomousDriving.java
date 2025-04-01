package ro.ase.csie.cts.assignment2;

public class AutonomousDriving {
	
	String version;

	public AutonomousDriving(String version) throws InterruptedException {
		this.version = version;
		System.out.println("Start AI module....");
		Thread.sleep(5000);
		System.out.println("Init AI module....learning done");
	}
}
