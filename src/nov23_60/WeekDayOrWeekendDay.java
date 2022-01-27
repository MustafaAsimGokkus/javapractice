package nov23_60;

import java.util.Scanner;

public class WeekDayOrWeekendDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a day");
		String day = scan.next();
		String str = day.toLowerCase();
		if(str.equals("monday")||str.equals("tuesday")||str.equals("wednesday")||str.equals("thursday")||str.equals("friday")) {
			System.out.println("Weekday!");
		}else if(str.equals("sunday")||str.equals("saturday")) {
			System.out.println("Endlich Wochenende!");
		}else {
			System.out.println("Enter the day correctly");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
