package nov25_71;

import java.util.Scanner;

/*
 Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
and print it on the console.
 */
public class Review8701 {
       
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		int num =scan.nextInt();
		
		int result = num == 10 ? num : num>10? num*2 : num*num;
		
		System.out.println(result);
		
		
		
		
	}
	
}
