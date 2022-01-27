package nov23_60;

import java.util.Scanner;

/*Type java code by using if-else statement,
    Write a program to print absolute value of a number entered by user.
    Absolute Value: If the number is positive or zero return the number itself
    If the number is negative return the number after multiplying by -1 */
    
public class AbsoluteValue6306 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
	    System.out.println("Enter a number");
			
		int num = scan.nextInt();
		
		if (num < 0) {
			System.out.println("Absolute value is : "+ num*-1);
		}else {
			System.out.println("Absolute value is " + num );
		}
		
		
		
		
		
		
	}

}
