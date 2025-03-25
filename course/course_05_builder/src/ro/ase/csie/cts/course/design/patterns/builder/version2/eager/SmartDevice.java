package ro.ase.csie.cts.course.design.patterns.builder.version2.eager;

import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceDisplay;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceExternalMemory;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceGPS;
import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceSIMCard;

public class SmartDevice {
	
	String model;
	String manufacturer;
	
	boolean hasWiFi;
	
	InterfaceSIMCard SIM;
	InterfaceGPS GPSModule;
	InterfaceDisplay display;
	InterfaceExternalMemory memoryCard;
	
	SmartDevice(){
		
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public boolean isHasWiFi() {
		return hasWiFi;
	}

	public InterfaceSIMCard getSIM() {
		return SIM;
	}

	public InterfaceGPS getGPSModule() {
		return GPSModule;
	}

	public InterfaceDisplay getDisplay() {
		return display;
	}

	public InterfaceExternalMemory getMemoryCard() {
		return memoryCard;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	void setSIM(InterfaceSIMCard sIM) {
		SIM = sIM;
	}

	void setGPSModule(InterfaceGPS gPSModule) {
		if(gPSModule == null) {
			throw new NullPointerException();
		}
		GPSModule = gPSModule;
	}

	void setDisplay(InterfaceDisplay display) {
		this.display = display;
	}

	void setMemoryCard(InterfaceExternalMemory memoryCard) {
		this.memoryCard = memoryCard;
	}
	
}
