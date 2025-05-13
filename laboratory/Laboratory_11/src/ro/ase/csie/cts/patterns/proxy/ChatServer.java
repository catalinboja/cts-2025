package ro.ase.csie.cts.patterns.proxy;

public class ChatServer implements IChatServer {

	protected String IP;
	
	
	public ChatServer(String iP) {
		super();
		IP = iP;
	}


	@Override
	public void sendMessage(String username, String message) {
		System.out.println("Message to: " + username);
		System.out.println(message);
		
	}

}
