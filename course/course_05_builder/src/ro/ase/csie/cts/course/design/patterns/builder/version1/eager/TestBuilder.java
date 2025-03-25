package ro.ase.csie.cts.course.design.patterns.builder.version1.eager;

import ro.ase.csie.cts.course.design.patterns.builder.module.DisplaySuperAmoled;
import ro.ase.csie.cts.course.design.patterns.builder.module.GPSIntern;
import ro.ase.csie.cts.course.design.patterns.builder.module.SDCard;
import ro.ase.csie.cts.course.design.patterns.builder.module.TelCoSIMCard;
import ro.ase.csie.cts.course.design.patterns.builder.version1.eager.SmartDevice.SmartDeviceBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//SmartDevice smartDevice = new SmartDevice();
		
		
		SmartDevice smartPhone = 
				new SmartDevice.SmartDeviceBuilder("S22","Samsung")
				.addWiFi()
				.addGPS(new GPSIntern())
				.addMemoryCard(new SDCard(100))
				.build();
		//you can't set the attributes later
		
	
		
		SmartDeviceBuilder smartDeviceBuilder = 
				new SmartDeviceBuilder("S22", "Samsung");
		SmartDevice smartDevice = 
				smartDeviceBuilder.addWiFi()
				.addMemoryCard(new SDCard(32))
				.addSIM(new TelCoSIMCard())
				.build();
		
		SmartDevice smartDeviceApple = 
				new SmartDeviceBuilder("X22", "Apple")
				.addDisplay(new DisplaySuperAmoled(10))
				.addWiFi()
				.addSIM(new TelCoSIMCard())
				.build();
		
		SmartDeviceDirector devicesDirectory = 
				new SmartDeviceDirector(
						new SmartDeviceBuilder("S22", "Samsung"));
		SmartDevice phone = devicesDirectory.buildSamsungS22();
		
		
		//TO DO: init other attributes
		//smartDevice.set
		
	}

}
