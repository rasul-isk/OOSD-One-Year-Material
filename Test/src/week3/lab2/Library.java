package week3.lab2;

import java.util.Scanner;

public class Library {
	
	public static void main(String[] args) {
		
		Book[] books = new Book[3];
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Please enter the details for Book: " + (i+1));
			
			String name = in.nextLine();
			
			System.out.println("Please enter author for Book: " + (i+1));
			
			String author = in.nextLine();
			
			System.out.println("Please enter genre for Book: " + (i+1));
			
			String genre = in.nextLine();
			
			Book b = new Book(name,author,genre);
		}
	}
}
