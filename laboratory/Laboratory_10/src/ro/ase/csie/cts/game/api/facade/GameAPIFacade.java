package ro.ase.csie.cts.game.api.facade;

public class GameAPIFacade {
	
	GameServerConnection server;
	GameClient client;
	
	public GameAPIFacade(String serverIP, String clientVersion) {
		this.server = new GameServerConnection(serverIP);
		this.client = new GameClient(clientVersion, server);
		server.connect();
	}
	
	public PlayerAccount openAccount(String username, String pass) {
		PlayerAccount account = new PlayerAccount(username, pass);
		account.login(this.client);
		return account;
	}
	
	
	
	
}
