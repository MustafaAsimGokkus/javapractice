package nov25_71;
/*
 * 
Q1:Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.

Q2:Type java code by using ternary and if-else. Ask user to enter two integers
Write a program to print the minimum one on the console.

Q3: Type java code by using ternary.
Write a program to print absolute value of an integer entered by user.

Q4:Type java code by using using ternary.
Take values of length and width of a rectangle from user and check if it is square or not.


Q5:Ask user to enter a String. If the String has 2 characters, output will be
“It is valid for state abbreviations” Otherwise, output will be 
“It is not valid for state abbreviations”


Q6:Ask user to enter an integer. If the number has 3 digits, output will be
“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
How can you decide the number of digits of an integer?


Q7:Ask user ta enter a number. If the number is less than 10 and greater
than or equal to 0, calculate its cube. Otherwise, calculate its square.
Cube of a = a*a*a Square of a = a*a



 */
public class ternaryoperatorquestions76 {

	public static void main(String[] args) {
	
	 
	 
	/*A1 I assume value is available from user
	int num1 = 12;
	String result1 = num1%2==0 ? num1 +" is even" : num1 +" is odd";
	System.out.println(result1);*/	

	/* A2
	int num2 =45;
	int num3 = 46;
	int result2 = num2>num3 ? num2 : num3;
	System.out.println(result2);*/
		 	
	/* A3
	int num4 = -55;
	int absoluteValueOfnum4 = num4>=0 ? num4 :-num4; 
	System.out.println("Absolute value of "+ num4 +" is: "+ absoluteValueOfnum4);*/	
		
	/*A4
	int lengthOfRectangle =	12;
	int widthOfRectangle =	12;
	String result3 = lengthOfRectangle == widthOfRectangle	 ? "It is a square":"It is a rectangle. Not a square";
	System.out.println(result3);*/		
		
	/* A5
	String str1 = "ch";
	String result4 = str1.length() == 2 ? "it can be country abbreviation" : "it can not be country abbreviation";
	System.out.println(result4);	*/
	
	/* A6
	int num5 = 55555;
			
	String result5 = num5/1000 == 0? num5+" is 3 digit": num5+" is not 3 digit";
	System.out.println(result5);*/
	
	/* A7*/
	
	int num6 = 9;
	int result6 = num6 <10 && num6>=0 ? num6*num6*num6 : num6*num6;
	System.out.println(result6);
	}

}
