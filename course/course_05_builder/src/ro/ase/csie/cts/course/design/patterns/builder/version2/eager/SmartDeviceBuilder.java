package ro.ase.csie.cts.course.design.patterns.builder.version2.eager;

import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceDisplay;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceExternalMemory;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceGPS;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceSIMCard;

public class SmartDeviceBuilder {
	private SmartDevice smartdevice = null;
	
	public SmartDeviceBuilder(String model, String manufacturer) {
		this.smartdevice = new SmartDevice();
		this.smartdevice.setModel(model);
		this.smartdevice.setManufacturer(manufacturer);
	}
	
	public SmartDeviceBuilder addWiFi() {
		this.smartdevice.setHasWiFi(true);
		return this;
	}
	
	public SmartDeviceBuilder addSIM(InterfaceSIMCard sIM) {
		this.smartdevice.setSIM(sIM);
		return this;
	}
	
	public SmartDeviceBuilder addGPS(InterfaceGPS gPSModule) {
		this.smartdevice.setGPSModule(gPSModule);
		return this;
	}
	
	public SmartDeviceBuilder addDisplay(InterfaceDisplay display) {
		this.smartdevice.setDisplay(display);
		return this;
	}
	
	public SmartDeviceBuilder addMemoryCard(InterfaceExternalMemory memoryCard) {
		this.addMemoryCard(memoryCard);
		return this;
	}
	
	public SmartDevice build() {
		return this.smartdevice;
	}
}
