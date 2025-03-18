package ro.ase.csie.cts.course.liskov;

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
}

//Square class (Follows LSP correctly)
class Square extends Shape {
 private double side;

 public Square(double side) {
     this.side = side;
 }

 @Override
 public double getArea() {
     return side * side;
 }
}

//Main class to test LSP
public class LiskovExample {
 public static void main(String[] args) {
     Shape shape = new Rectangle(4, 5);
     System.out.println("Rectangle Area: " + shape.getArea()); // 20.0
     
     shape = new Square(4);
     System.out.println("Square Area: " + shape.getArea());  // 16.0
 }
}
