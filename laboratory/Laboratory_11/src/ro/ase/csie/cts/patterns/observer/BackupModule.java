package ro.ase.csie.cts.patterns.observer;

public class BackupModule implements INotificationService{

	@Override
	public void react(String event) {
		System.out.println("Backing up game data....");
		System.out.println("Reason: " + event);
	}

}
