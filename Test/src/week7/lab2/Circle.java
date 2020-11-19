package week7.lab2;

import week7.lab1.Point;

public class Circle extends Point{
	
	private double radius;
	
	public Circle(int x, int y, double r) {
		super(x,y);
		setRadius(r);
	}

	
	//Getters & Setters
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}



	
	//toString
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
