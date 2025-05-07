package ro.ase.csie.cts.game.api.facade;

public class GameClient {
	String version;
	GameServerConnection server;
	
	public GameClient(String version, GameServerConnection server) {
		super();
		this.version = version;
		this.server = server;
	}
	
	public void init() {
		System.out.println("Starting game client version " + 
				this.version);
	}
	
}
