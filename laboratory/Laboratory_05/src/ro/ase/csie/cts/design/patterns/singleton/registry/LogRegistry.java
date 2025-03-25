package ro.ase.csie.cts.design.patterns.singleton.registry;

import java.util.HashMap;

public class LogRegistry {
	
	private static HashMap<String, LogRegistry> logs = 
			new HashMap<>();
			
	private String filename;

	private LogRegistry(String filename) {
		System.out.println("Creating " + filename);
		this.filename = filename;
	}
	
	public static LogRegistry getLog(String filename) {
		LogRegistry log = logs.get(filename);
		if(log == null) {
			log = new LogRegistry(filename);
			logs.put(filename, log);
		}
		return log;
	}
	
	

}
