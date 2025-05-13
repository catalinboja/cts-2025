package ro.ase.csie.cts.patterns.proxy;

public class ChatServerFilterProxy implements IChatServer	{

	IChatServer realChatServer;
	
	String[] forbiddenWords = {"fight", "stupid", "wrong"};
	
	
	public ChatServerFilterProxy(IChatServer realChatServer) {
		super();
		this.realChatServer = realChatServer;
	}


	@Override
	public void sendMessage(String username, String message) {

		//filter the messages
		for(String word : forbiddenWords) {
			if(message.contains(word)) {
				System.out.println("Message blocked: " + message);
				return;
			}
		}
		this.realChatServer.sendMessage(username, message);
	}

}
