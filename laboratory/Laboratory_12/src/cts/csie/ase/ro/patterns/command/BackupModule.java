package cts.csie.ase.ro.patterns.command;

public class BackupModule implements IGameModule {

	@Override
	public void executeTask(String params) {
		System.out.println("Backing up game data....");
		System.out.println("Location: " + params);
	}
	
}
