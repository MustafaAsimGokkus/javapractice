package nov23_60;

import java.util.Scanner;

public class CheckingCharOrNot {

	public static void main(String[] args) {
       /*
        Ask user to enter a character, then check 
        whether the character is alphabet or not
        */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a character");
		
		char chr = scan.next().charAt(0);
	
	  String Result = (chr >= 'A' && chr <= 'Z') || (chr >= 'a' && chr <= 'z') ? chr +" is alphabetical" : chr+ " is non-alphabetical";
	System.out.println(Result);
	}   
	
}
