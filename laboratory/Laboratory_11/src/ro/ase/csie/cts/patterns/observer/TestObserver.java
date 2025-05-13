package ro.ase.csie.cts.patterns.observer;

public class TestObserver {
	
	public static void main(String args[]) {
		ConnectionMonitor monitor = new ConnectionMonitor();
		
		NotificationsModule notifications = new NotificationsModule();
		
		monitor.registerObserver(notifications);
		monitor.registerObserver(new BackupModule());
		
		monitor.checkConnection();
		
		monitor.unregisterObserver(notifications);
		
		monitor.checkConnection();
	}

}
