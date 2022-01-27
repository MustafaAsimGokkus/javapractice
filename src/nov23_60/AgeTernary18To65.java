package nov23_60;

import java.util.Scanner;

/*
  Ask user to enter his/her age. If the age is between 18 and 65 then 
  output will be “You should work”, else output will be “No need to work”
  */
  public class AgeTernary18To65 {
  public static void main(String[] args) {
	

  Scanner scan = new Scanner (System.in);
  System.out.println("Enter your age");
  int age = scan.nextInt(); 
  
  
  
  
  if (age > 18 &&   age <66 ) {
	  System.out.println("work");
	 
  }  else {System.out.println("no need to work"); 
  }
	  
	  
  }	  
  }  

