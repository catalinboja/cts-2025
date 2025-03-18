package ro.ase.csie.cts.course.liskov.incorrect;


//Base shape class
abstract class Shape {
	abstract double getArea();
}

//Rectangle class
class Rectangle extends Shape {
	protected double width;
	protected double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}

public class NotOkSquare extends Rectangle {

	public NotOkSquare(double side) {
		super(side, side);
	}

	@Override
	public void setWidth(double width) {
		super.width = width;
		super.height = width; // Unexpected behavior: changes height too!
	}

	@Override
	public void setHeight(double height) {
		super.width = height;
		super.height = height; // Unexpected behavior: changes width too!
	}
}
