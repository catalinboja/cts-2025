package ro.ase.csie.cts.game.api.facade;

public class TestGame {

	public static void main(String[] args) {

		//Without facade
		//Use case: log in into the game for a player
		
		//Step 1 Init and open the game server connection
		GameServerConnection server = 
				new GameServerConnection("10.0.0.1");
		if(server.connect()) {
			
			//Step 2 Init a game client
			GameClient client = new GameClient("v.1.0.1", server);
			client.init();
			
			//Step 3 Init Player Account
			PlayerAccount account = 
					new PlayerAccount("player1", "1234");
			
			//Step 4 Login
			account.login(client);
			
			//Do anything you need to do
			
		}
		
		//Use case with facade
		GameAPIFacade gameApi = new GameAPIFacade(
				"10.0.0.1", "v.1.0.1");
		PlayerAccount player1 = gameApi.openAccount("player1", "1234");
		
	}

}
