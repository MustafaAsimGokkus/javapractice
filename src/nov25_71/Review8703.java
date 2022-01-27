package nov25_71;

import java.util.Scanner;

/*
   Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
   If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
    “Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
   If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
 */
public class Review8703 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a character");
		char chr =scan.next().charAt(0);
		
		if(chr < 'Z' && chr > 'A') {
			if(chr <'F') {
				System.out.println("Big before F");
				
			}else {
				System.out.println("Big after F");
			}
		}else if (chr < 'z' && chr > 'a') {
			if(chr < 'h') {
				System.out.println("Small before h");
			}else {
				System.out.println("Small after h");
			}
			
		}

	}

}
