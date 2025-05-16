package cts.csie.ase.ro.patterns.command;

public class UpdateModule implements IGameModule {

	@Override
	public void executeTask(String params) {
		
		System.out.println("Starting game update.....");
		System.out.println("Connecting server at " + params);
		
	}
}
