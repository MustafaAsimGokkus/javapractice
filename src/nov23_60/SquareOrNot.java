package nov23_60;

import java.util.Scanner;

public class SquareOrNot {

	public static void main(String[] args) {
		/*
		 Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
		 */
    
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter width of a rectangle");
	double width = scan.nextDouble();	
	System.out.println("Enter length of a rectangle");
	double length = scan.nextDouble();		
	
	if (width == length) {
		System.out.println("It is a square!");
	}else {
		System.out.println("It is a rectangle!");
	}
		
		
		
		
		
		
		
		
		
	}

}
