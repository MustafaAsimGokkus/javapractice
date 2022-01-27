package nov26;

import java.util.Scanner;

/*
 Q1: Type java code by using while loop,Write a program to print numbers from 1 to 5.
  
  
 Q2:Type java code by using while loop.Write a program that types first 30 consecutive odd integers.
 

 Q3:Write a program to print numbers which are divisible by 5 between 1 and 100 on the console by using do-while loop.
 
 Q4: Write a program to print letters from c to m on the console by using do-while loop.
 Q5: Ask user to enter a number. If the number is divisible by 10 then print "Won!" on the console otherwise ask user 
 to enter another number. Use do-while loop.
  */



public class WhileLoop9001 {

	public static void main(String[] args) {
	
 /* Q1
    int i = 1;
  	while(i <6) {
	System.out.print(i + " ");
	i++;}  */
	

/* Q2
	int count = 0;
	int j = 1;	
	while (count < 31) {
		System.out.print(j+ " ");
		j+=2;
		count++;} */
/*
  Q3 int h = 5;
   while (h <101) {
	  System.out.print(h + " ");
	  h+=5;  }*/
		
 /*
  		
  Q4
	 char print = 'c'; 
	 
	 while (print < 'n') {
		 System.out.print(print + " ");
		 print++;
	 }*/
    
	Scanner scan = new Scanner (System.in);	
	
	
	int num;
	do { 
		System.out.println("Enter a number");
		num = scan.nextInt();	
		
		
		
	}while( num %10 != 0);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
