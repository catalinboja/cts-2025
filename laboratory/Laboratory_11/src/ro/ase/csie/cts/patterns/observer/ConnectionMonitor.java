package ro.ase.csie.cts.patterns.observer;

import java.util.ArrayList;

public class ConnectionMonitor {
	
	ArrayList<INotificationService> observers = new ArrayList<>();
	
	public void registerObserver(INotificationService service) {
		this.observers.add(service);
	}
	
	public void unregisterObserver(INotificationService service) {
		this.observers.remove(service);
	}
	
	public void sendNotifications() {
		for(INotificationService service : this.observers) {
			service.react("Connection lost");
		}
	}
	
	public void checkConnection() {
		System.out.println("Connection UP");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection DOWN");
		this.sendNotifications();
	}
	
}
