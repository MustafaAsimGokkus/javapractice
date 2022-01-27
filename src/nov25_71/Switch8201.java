package nov25_71;

 
 /* Q1 : If the user pressed 1, 2, 3 the program will print the number 
 that is pressed; otherwise, program will print "Not allowed".
 
 Q2:Write a Java program user will choose answer among A, B, C, or D.
 If the answer is true, output will be “True.” If the answer is false, output will be
 “False”. Correct answer is ‘C’ for the multiple option question.
 
 Q3:Type java code by using switch statement.
 A school has following rules for grading system:
 1. For 50 - C 2. For 80 - B. 4. For 100 - A
 Ask user to enter marks and print the corresponding grade.
 
 Q4:Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
 Then type a program by using “switch statement” to print “United” for ‘U’
 ”States” for ’S’, and “America” for ‘A’*/
 
 
public class Switch8201 {

 
 
	public static void main(String[] args) {
	
 /*   	Q1
  	
        int num = 4;
		
		switch (num) {
		
		case 1:
			System.out.println(1);
		    break;
		case 2:
			System.out.println(2);
		    break;
		case 3:
			System.out.println(3);
		    break;
		default:
			System.out.println("Not allowed");      */
		
		
		/*
		 Q2 
		 
		 
		 
		char chr = 'C';
		
		switch (chr) {
		
		case'A':
			System.out.println("False");
		    break;
		    
		case'B':
			System.out.println("False");
		    break;
		
		case'C':
			System.out.println("True");
		    break;
		
		case'D':
			System.out.println("False");
		    break;}*/
		
		
		/* Q3 
		int grade = 800;
		
		switch(grade ) {
		case 50 :
			System.out.println("C");
			break;
			
		case 80 :
			System.out.println("B");
			break;	
			
		case 100 :
			System.out.println("A");
			break;	
		default:
			System.out.println("Enter grade as 50-80 or 100"); */
		
		char usersEnteredChar = 'S';
		
		switch (usersEnteredChar) {
		case 'U' :
			System.out.println("United");
			break;
			
		case 'S' :
			System.out.println("States");
			break;
			
		case 'A' :
			System.out.println("America");
			break;
		default : 
			System.out.println("");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

