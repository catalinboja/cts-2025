package ro.ase.csie.cts.course.design.patterns.builder.initial;

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
	
	public SmartDevice(){
		
	}
	
	public SmartDevice(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}

	public SmartDevice(
			String model, 
			String producator, 
			boolean WiFiIntegrat,
			InterfaceSIMCard sim,
			InterfaceGPS modulGPS,
			InterfaceDisplay display,
			InterfaceExternalMemory cardMemorie){
	this.model = model;
	this.manufacturer = producator;
	this.hasWiFi = WiFiIntegrat;
	this.SIM = sim;
	this.GPSModule = modulGPS;
	this.display = display;
	this.memoryCard = cardMemorie;
	}
	

	public boolean hasWiFi() {
		return hasWiFi;
	}

	public void hasWiFi(boolean areWiFi) {
		this.hasWiFi = areWiFi;
	}

	public InterfaceSIMCard getSIM() {
		return SIM;
	}

	public void setSIM(InterfaceSIMCard sIM) {
		SIM = sIM;
	}

	public InterfaceGPS getModulGPS() {
		return GPSModule;
	}

	public void setModulGPS(InterfaceGPS modulGPS) {
		this.GPSModule = modulGPS;
	}

	public InterfaceExternalMemory getCardMemorie() {
		return memoryCard;
	}

	public void setCardMemorie(InterfaceExternalMemory cardMemorie) {
		this.memoryCard = cardMemorie;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getProducator() {
		return manufacturer;
	}


	public void setProducator(String producator) {
		this.manufacturer = producator;
	}


	public InterfaceDisplay getDisplay() {
		return display;
	}


	public void setDisplay(InterfaceDisplay display) {
		this.display = display;
	}

	
}
