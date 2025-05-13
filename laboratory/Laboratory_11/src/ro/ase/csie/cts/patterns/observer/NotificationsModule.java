package ro.ase.csie.cts.patterns.observer;

public class NotificationsModule implements INotificationService{

	@Override
	public void react(String event) {
		System.out.println("PopUp: " + event);
	}

}
