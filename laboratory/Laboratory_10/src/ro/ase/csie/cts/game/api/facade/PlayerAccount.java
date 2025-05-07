package ro.ase.csie.cts.game.api.facade;

public class PlayerAccount {
	String username;
	String password;
	
	public PlayerAccount(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public void login(GameClient gameClient) {
		System.out.println("Log in into the game");
	}
	
	
}
