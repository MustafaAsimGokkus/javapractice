package nov23_60;

import java.util.Scanner;

/*
   Ask user to enter a 4 digits integer, then print the sum of the first
   and the last digit of the number on console.
    */
public class SumOfDigits6401 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a four digit integer...");
		int num = scan.nextInt();
		int lastDigit = num%10;
		int firstDigit = num/1000;
		System.out.println("Sum of first and last digit = "+ (lastDigit+firstDigit));
		
		
		
		
		
		
		
	}

}
