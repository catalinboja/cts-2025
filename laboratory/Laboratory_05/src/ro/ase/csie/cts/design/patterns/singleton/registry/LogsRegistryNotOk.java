package ro.ase.csie.cts.design.patterns.singleton.registry;

import ro.ase.csie.cts.design.patterns.singleton.logging.ILogging;

public class LogsRegistryNotOk implements ILogging{

	//LAZY IMPLEMENTATION
	private static LogsRegistryNotOk logs = null;
	
	private String fileName;
	
	private LogsRegistryNotOk(String fileName) {
		System.out.println("Creating log file " + fileName);
		this.fileName = fileName;
	}
	
	public static LogsRegistryNotOk getLogs(String fileName) {
		if(logs == null) {
			logs = new LogsRegistryNotOk(fileName);
		}
		return logs;
	}

	@Override
	public void error(String msg) {
		System.out.println("Add " + msg + " " + this.fileName);
	}

	@Override
	public void info(String details) {
		// TODO Auto-generated method stub
		
	}
	
}
