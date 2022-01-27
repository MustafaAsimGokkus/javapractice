package nov23_60;

import java.util.Scanner;

public class MoreTernaryGame6204 {

	public static void main(String[] args) {
		
		/* Ask user ta enter any name of the week, then get second ,fourth,
         and sixth letter of the day name and print them on the console,
         in the same line.
         For example; if the user enters “Monday” output will be “ody” */
		
       Scanner scan = new Scanner (System.in);
    	
       System.out.println("Enter one of seven weekdays");
		
		String day = scan.next();
		
		String result = ""+ day.charAt(1)+day.charAt(3)+day.charAt(5);
		System.out.println(result);
		
	}

}
