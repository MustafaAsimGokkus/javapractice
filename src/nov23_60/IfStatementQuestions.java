package nov23_60;

import java.util.Scanner;

public class IfStatementQuestions {

	public static void main(String[] args) {
		/*
		 Type java code, if an integer is even, output will be “The integer is even”.
         If the integer is odd, output will be “The integer is odd”.
		 */
   
		int i = 19685;
		
		if(i%2 ==0) {
			System.out.println(i +" is even");
		}else {
			System.out.println(i +" is odd");
		}
				
		/*
		 Type java code by using if statement. When you enter the initial of the day of a week,
         output should be all possible names of the days.
          For example; if the initial is ’S’ output should be “Saturday or Sunday”
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the initial letter of the weekday");
		String initial = scan.next();
		if(initial.toLowerCase().equals("m")) {
			System.out.println("Monday");
		}else if(initial.toLowerCase().equals("t")) {
			System.out.println("Tuesday or Thursday");
		}else if(initial.toLowerCase().equals("w")) {
			System.out.println("Wednesday");
		}else if(initial.toLowerCase().equals("f")) {
				System.out.println("Friday");
		}else if(initial.toLowerCase().equals("s")) {
			System.out.println("Saturday or Sunday");
	  	}else {
	  		System.out.println("Enter the initial letter correctly");
	  	}
	}
}
