package nov23_60;

import java.util.Scanner;

public class AgeGenderRetired {

	public static void main(String[] args) {
	/*
	 Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
     then output will be “Hey man you retired!” else output will be “No need to work”
	 */
		
		Scanner scan = new Scanner (System.in);
	    
		System.out.println("Enter your age");
		int age = scan.nextInt(); 
		
		System.out.println("Enter your gender as male or female");
		String gender = scan.next() ;
		
		if(age > 65 && gender.toLowerCase().equals("male")) {
			System.out.println("Hey man you retired!");
		}else {System.out.println("No need to work");
			
		}
			
			
		}
		
		
		
		
		
	

}
