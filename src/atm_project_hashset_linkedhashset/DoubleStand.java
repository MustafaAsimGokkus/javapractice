package atm_project_hashset_linkedhashset;

import java.util.Scanner;

public class DoubleStand {

	public static void main(String avs[])
    {
	     int count, num1 = 0, num2 = 1;
	        System.out.println("How may numbers you want in the sequence:");
	        Scanner scanner = new Scanner(System.in);
	        count = scanner.nextInt();
	        scanner.close();
	        //System.out.print("Fibonacci Series of "+count+" numbers:");

	        int i=1;
	        while(i<=count)
	        {
	           
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	            i++;
	            System.out.print(num1+" ");
	        }
	      
	    }
	}