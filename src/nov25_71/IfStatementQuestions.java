package nov25_71;

import java.util.Scanner;

/*
  Q1:Type java code by using if-else if() statement,
  if both of the two integers are positive, output will be the sum of them.
  If both of the two integers are negative, output will be the multiplication of them.
  Otherwise; output will be “I cannot add or multiply different signed numbers”

  Q2:If age is less than 13 output will be “Should not work”, If age is greater
  than 65 output will be “Retired”, Otherwise; output will be “Should work”

  Q3:Type java code by using if-else if() statement.
  A school has following rules for grading system:
  1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
  Ask user to enter marks and print the corresponding grade.
  
  Q4 
  Ask user to enter year
  Type java code by using if-else if() statement.Write a program to check if a year
  is leap year or not. if the year is divisible by 100 then it must be divisible 
  by 400. If a year is not divisible by 100 then it must be divisible by 4.
 
  Q5: Ask user to enter annual salary, if the salary is more than or equal
  to $80.000 output will be “I accept the offer”, if the salary is between
  $60.000 and $80.000 out put will be “I negotiate to increase”,
  otherwise output will be “I do not accept the offer.”
 
 
  Q5
     Ask user to enter annual salary, if the salary is more than or equal
        to $80.000 output will be “I accept the offer”, if the salary is between
        $60.000 and $80.000 out put will be “I negotiate to increase”,
        otherwise output will be “I do not accept the offer.”
 */
public class IfStatementQuestions {

	public static void main(String[] args) {
 //Q1   
		int num1 = 0;
		int num2 = 0;
		
		if(num1 >= 0 && num2>=0) {
			System.out.println(num1+num2);
		}else if(num1 < 0 && num2<0) {
			System.out.println(num1*num2);
		}else {
			System.out.println("I cannot add or multiply different signed numbers ");
		}
//Q2
		int age = 44;
		if( age<13 && age>=0) {
			System.out.println("Should not work");
		}else if(age>65) {
			System.out.println("Retired");
		}else {
			System.out.println("Should work");
		}
	
			
	
	
	 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score between 0 and 100");
		
		int grade = scan.nextInt(); // should be between 0-100
		/*
		if (grade>=0 && grade <50) {
			System.out.println("Grade is D");
		}if (grade>=50 && grade <60) {
			System.out.println("Grade is C");
		}if (grade>=60 && grade <80) {
			System.out.println("Grade is B");
		}if (grade>=80 && grade <= 100) {
			System.out.println("Grade is A");
		}*/
		
//Q4		
		System.out.println("Enter a year");
        int year = scan.nextInt();
       
    
     
        /*if(year<=0) {
        System.out.println("Enter a positive integer as year value");
	   }else if (year%100 ==0) {
		   if(year%400 == 0) {
			 System.out.println("It is a super leap year");  
		   }else {
			System.out.println("It is not a leap year");   
		   }
	   }else if (year % 4 == 0) {
		   System.out.println("It is a leap year");
		   
	   }else {System.out.println("It is not a leap year");}    */
        
       String result = year>0 ? year%100 ==0 ? year%400 ==0 ? "super leap year": "not leap" : year%4 ==0 ? "leap year" : "not leap": "enter a positive year";
        System.out.println(result);
    
   // Q5     
     int salary = 65000; // intentionally not used scanner takes much time
     
     String result2 = salary >= 80000 ? "I accept": salary >=60000 && salary < 80000 ? "negotiate":"refuse";
        System.out.println(result2);
	} 		
	}
