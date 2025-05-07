package ro.ase.csie.cts.models.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3DFlyweight implements Model3DFlyweightInterface{
	ArrayList<Integer> points = new ArrayList<Integer>(); //3d model data
	
	String name;
	
	public Model3DFlyweight(String name) {
		this.name = name;
		System.out.println("Init model for " + this.name);
		//this.points = new ArrayList<Integer>();
		Random random = new Random();
		for(int i = 0; i < 1000; i++) {
			this.points.add(random.nextInt(50000));
		}
		System.out.println("Done rendering the model");
	}

	@Override
	public void displayOnScreen(Coordinates coordinates) {

		System.out.println("Display model. Draw points: ");
		for(int i = 0; i < 10; i++) {
			System.out.println(this.points.get(i));
		}
		System.out.println("Place model at " + coordinates.getX() + 
				"," + coordinates.getY());
	
	}
}



