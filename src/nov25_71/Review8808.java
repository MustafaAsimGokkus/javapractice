package nov25_71;

import java.util.Scanner;

/*
  Ask user to enter his/her first name, last name and Social Security Number.
  Then type a program which makes
  a) initials of the first name and the last name in uppercase,
  other characters will be in lowercase.
  b) all characters except last 4 characters of the Social Security Number “ * ”.
  For example; Suleyman Alptekin *****5678
 */
public class Review8808 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your name...");
	String name = scan.nextLine();
	System.out.println("Enter your surname...");
	String surname = scan.nextLine();
	System.out.println("Enter your SSN...");
	String SSN = scan.next();
	
	String nameEdited = name.toUpperCase().charAt(0)+name.substring(1);
	String surnameEdited = surname.toUpperCase().charAt(0)+surname.substring(1);
	String SSNEdited = "*****"+SSN.substring(5, 9);
	
	System.out.println("Name: "+ nameEdited+ " Surname: "+ surnameEdited + " SSN:" + SSNEdited );
	
	
}
}
