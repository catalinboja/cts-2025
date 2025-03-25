package ro.ase.csie.cts.course.design.patterns.builder.version1.eager;

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
	
	private SmartDevice(){
		
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

	private void setModel(String model) {
		this.model = model;
	}

	private void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	private void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	private void setSIM(InterfaceSIMCard sIM) {
		SIM = sIM;
	}

	private void setGPSModule(InterfaceGPS gPSModule) {
		if(gPSModule == null) {
			throw new NullPointerException();
		}
		GPSModule = gPSModule;
	}

	private void setDisplay(InterfaceDisplay display) {
		this.display = display;
	}

	private void setMemoryCard(InterfaceExternalMemory memoryCard) {
		this.memoryCard = memoryCard;
	}
	
	
	
//	private SmartDevice(String model, String manufacturer) {
//		this.model = model;
//		this.manufacturer = manufacturer;
//	}

//	private SmartDevice(
//			String model, 
//			String producator, 
//			boolean WiFiIntegrat,
//			InterfataSIMCard sim,
//			InterfataGPS modulGPS,
//			InterfataDisplay display,
//			InterfataExternalMemory cardMemorie){
//	this.model = model;
//	this.manufacturer = producator;
//	this.hasWiFi = WiFiIntegrat;
//	this.SIM = sim;
//	this.GPSModule = modulGPS;
//	this.display = display;
//	this.memoryCard = cardMemorie;
//	}
	

	public static class SmartDeviceBuilder {
		
		
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
	

	
}
