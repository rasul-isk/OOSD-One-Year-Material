package week6.lab2;

import java.util.Random;

public class Dice {
	
	//Variables
	private int faceValue;
		
	
	//Constructors
	
	public Dice() {
		roll();
	}
	
	
	//Getters & Setters
	
	public int getFaceValue() {
		return faceValue;
	}


	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	//toString
	
	public void roll() {
		Random rand = new Random();
		faceValue = rand.nextInt((6-1)+1)+1;
		
	}
	
	
	
}
