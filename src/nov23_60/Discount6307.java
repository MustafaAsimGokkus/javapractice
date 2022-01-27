package nov23_60;

import java.util.Scanner;

/*
   Type java code by using if-else statement.
   A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
   Ask user for quantity and unit price then judge and print total cost for user.
   If the quantity is less than 1000 output will be “No discount.”
   */
public class Discount6307 {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner (System.in);
		
	    System.out.println("Enter the quantity ");
		int qtty = scan.nextInt();
		
		System.out.println("Enter the price ");	
		int price = scan.nextInt();

        if (qtty*price>1000) {
        	System.out.println("You won 10% discount.");
        } else {
        	System.out.println("No discount");
        }
		
		
	}

}
