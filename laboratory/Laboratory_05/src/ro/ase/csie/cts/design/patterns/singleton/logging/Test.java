package ro.ase.csie.cts.design.patterns.singleton.logging;

public class Test {

	public static void main(String[] args) {

		FileLogging logs = FileLogging.getLog();
		logs = FileLogging.getLog();
		logs = FileLogging.getLog();
		
		FileLoggingAlternative logsAlt = 
				FileLoggingAlternative.log;
		logsAlt = FileLoggingAlternative.log;
		logsAlt = FileLoggingAlternative.log;
		
		logsAlt.error("We have an error!");
	}

}
