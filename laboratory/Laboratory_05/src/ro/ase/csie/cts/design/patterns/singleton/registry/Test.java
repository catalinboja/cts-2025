package ro.ase.csie.cts.design.patterns.singleton.registry;

public class Test {

	public static void main(String[] args) {

		LogsRegistryNotOk errorLogs = LogsRegistryNotOk.getLogs("errors.log");
		
		// later
				
		LogsRegistryNotOk infoLogs = LogsRegistryNotOk.getLogs("info.log");
			
		errorLogs.error("An error");
		infoLogs.error("Bla bla");
		
		// The ok solution
		System.out.println("---------------------");
		
		LogRegistry errorLog = LogRegistry.getLog("error.log");
		LogRegistry errorLog2 = LogRegistry.getLog("error.log");
		
		LogRegistry infoLog = LogRegistry.getLog("info.log");
		LogRegistry infoLog2 = LogRegistry.getLog("info.log");
	}

}
