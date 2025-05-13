package ro.ase.csie.cts.patterns.proxy;

public class TestProxy {

	public static void main(String[] args) {

		IChatServer chatServer = new ChatServer("10.0.0.1");
		
		chatServer = new ChatServerFilterProxy(chatServer);
		
		chatServer.sendMessage("John", "Hello !");
		chatServer.sendMessage("John", "Let's fight !");
	}

}
