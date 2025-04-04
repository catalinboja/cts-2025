package ro.ase.csie.cts.course.design.patterns.builder.version1.eager;

import ro.ase.csie.cts.course.design.patterns.builder.module.DisplaySuperAmoled;
import ro.ase.csie.cts.course.design.patterns.builder.module.SDCard;
import ro.ase.csie.cts.course.design.patterns.builder.module.TelCoSIMCard;
import ro.ase.csie.cts.course.design.patterns.builder.version1.eager.SmartDevice.SmartDeviceBuilder;


public class SmartDeviceDirector {

	SmartDeviceBuilder builder;
	
	
	public SmartDeviceDirector(SmartDeviceBuilder builder) {
		super();
		this.builder = builder;
	}

	public SmartDevice buildSamsungS22() {
		return builder.addWiFi()
				.addModel("S22")
				.addManufacturer("Samsung")
				.addMemoryCard(new SDCard(32))
				.addSIM(new TelCoSIMCard())
				.build();
	}
	
	public SmartDevice buildAppleX22() {
		return builder
				.addModel("X22")
				.addManufacturer("Apple")
				.addDisplay(new DisplaySuperAmoled(10))
				.addWiFi()
				.addSIM(new TelCoSIMCard())
				.build();
	}
	
}
