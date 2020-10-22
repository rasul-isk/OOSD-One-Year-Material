package week2.lab2;

import java.util.Scanner;

public class Garage {

	public static void main(String[] args) {

		//1. List all Car
		//2. Enter a car for sale
		//3. List all Cars sold
		//4. Exit
		
		int choice = 0;
		
		while(choice !=4) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Please enter a choice:");
			System.out.println("1.List all Car");
			System.out.println("2.Enter a car for sale");
			System.out.println("3.List all Cars sold");
			System.out.println("4.Exit");
			
			choice = in.nextInt();
			
			if(choice == 1) {
				System.out.println("Choise1");
			}
			else if(choice == 2) {
				System.out.println("Choise2");
			}
			else if(choice == 3) {
				System.out.println("Choise3");
			}
			else if(choice == 4) {
				System.out.println("Goodbye!!!");
				System.exit(0);
			}
			
		}//end while
		

	}//end main

}//end class
