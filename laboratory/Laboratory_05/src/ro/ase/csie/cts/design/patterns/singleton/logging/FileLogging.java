package ro.ase.csie.cts.design.patterns.singleton.logging;

public class FileLogging implements ILogging{
	
	//EAGER INSTANTIATION
	private static FileLogging log = new FileLogging();

	private FileLogging() {
		System.out.println("Creating the log file");
	}
	
	public static FileLogging getLog() {
//not needed as the object is already created
//		if(log == null) {
//			log = new FileLogging();
//		}
		return log;
		
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
