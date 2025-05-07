package ro.ase.csie.cts.game.api.facade;

public class GameServerConnection {
	String ipAddress;

	public GameServerConnection(String ipAddress) {
		super();
		this.ipAddress = ipAddress;
	}
	
	boolean connect() {
		System.out.println("Connecting to " + this.ipAddress);
		return true;
	}
}
