package week5.lab2;

import java.util.Arrays;

public class Car {

	//Variables
	private String registrationNumber;
	private Wheel[] wheels = new Wheel[4];

	
	
	//Constructors
	
	public Car(String registrationNumber) {
		
		setRegistrationNumber(registrationNumber);
		
		for(int i = 0; i <= wheels.length-1; i++) {
			Wheel wheel = new Wheel(i+1);
			wheels[i] = wheel;
		}
	}
	
	//Getters & Setters
	


	public String getRegistrationNumber() {
		return registrationNumber;
	}	
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	
	//toString
	@Override
	public String toString() {
		return "Car [registrationNumber=" + registrationNumber + ", wheels=" + Arrays.toString(wheels) + "]";
	}
	
	
}
