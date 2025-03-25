package ro.ase.csie.cts.design.patterns.singleton.logging;

public class FileLoggingAlternative implements ILogging{
	
	//EAGER INSTANTIATION
	public static final FileLoggingAlternative log = new FileLoggingAlternative();

	private FileLoggingAlternative() {
		System.out.println("Creating the log file");
	}
	

	@Override
	public void error(String msg) {
		System.out.println("Error: " + msg);
	}

	@Override
	public void info(String details) {
		System.out.println("Info: " + details);
	}
	
}
