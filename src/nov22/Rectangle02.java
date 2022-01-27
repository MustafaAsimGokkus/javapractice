package nov22;

import java.util.Scanner;

/*
 Type a program like;
Ask user to enter two integer values, the first will be greater than the second.
The remainder when you divide the first by the second will be the width,
and the sum of the two numbers will be the length of a rectangle.
Then calculate the area and the perimeter of the rectangle, and print them
on the console.
 */
public class Rectangle02 {

	public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("Enter an integer...");
     int num1 = scan.nextInt();
     System.out.println("Enter an integer smaller than the first integer...");
     int num2 = scan.nextInt();
     
     if (num1>num2) {
    	int area = (num1%num2)*(num1+num2);
    	int perimeter = 2*(num1%num2+(num1+num2));
    	
    	System.out.println("Area: " + area + " Perimeter: "+ perimeter );
     }
     
	}

}
