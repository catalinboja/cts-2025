package ro.ase.acs.cts.design.patterns.adapter.objects;

import ro.ase.acs.cts.printer.InkPrinterInterface;
import ro.ase.acs.cts.printer.laser.LaserPinter;
import ro.ase.acs.cts.printer.laser.LaserPrinterInterface;

public class Test {

	public static void main(String[] args) {
		LaserPrinterInterface laserPrinter = 
				new LaserPinter();
		
		//InkPrinterInterface inkPrinter = laserPrinter;
		
		InkPrinterInterface inkPrinter = 
				new Laser2InkPrinterAdapter(laserPrinter);
		inkPrinter.print("Hello !");
		
	}

}
