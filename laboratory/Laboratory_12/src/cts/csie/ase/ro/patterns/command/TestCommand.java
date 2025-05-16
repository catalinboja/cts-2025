package cts.csie.ase.ro.patterns.command;

public class TestCommand {
	public static void main(String[] args) {
		
		TasksManager manager = new TasksManager();
		
		BackupModule backup = new BackupModule();
		UpdateModule update = new UpdateModule();
		
		//we create an async task for backup
		manager.addAsyncTask(new AsyncTask("game folder", backup));
		//we create an async task for update
		manager.addAsyncTask(new AsyncTask("10.0.0.1", update));
		
		System.out.println("The game runs");
		
		manager.executeNextTask();
		
		System.out.println("The game runs");
		
		manager.executeNextTask();
	}
}
